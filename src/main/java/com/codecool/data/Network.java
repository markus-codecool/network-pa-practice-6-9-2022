package com.codecool.data;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Network {
    private final Set<Device> devices;

    public Network() {
        this.devices = new HashSet<>();
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    public Set<Device> getDevices() {
        return devices;
    }
}
