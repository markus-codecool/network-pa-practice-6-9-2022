package com.codecool.service;

import com.codecool.data.*;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DeviceLookupService {
    public Set<NormalDevice> getNormalDevices(Network network) {
        return getDevicesByClass(network, NormalDevice.class);
    }

    public Set<LightWeightDevice> getLightWeightDevices(Network network) {
        return getDevicesByClass(network, LightWeightDevice.class);
    }

    public Set<SmartDevice> getSmartDevices(Network network) {
        return getDevicesByClass(network, SmartDevice.class);
    }

    private <T extends Device> Set<T> getDevicesByClass(Network network, Class<T> deviceClass) {
        return network.getDevices()
                .stream()
                .filter(d -> deviceClass.isAssignableFrom(d.getClass()))
                .map(d -> deviceClass.cast(d))
                .collect(Collectors.toSet());
    }

    public boolean deviceNameAvailable(Network network, String name) {
        Optional<SmartDevice> existingDevice = getSmartDevices(network)
                .stream()
                .filter(s -> s.getName().equals(name))
                .findFirst();
        return existingDevice.isEmpty();
    }
}
