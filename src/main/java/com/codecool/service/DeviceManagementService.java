package com.codecool.service;

import com.codecool.data.Device;
import com.codecool.data.Network;
import com.codecool.data.SmartDevice;

public class DeviceManagementService {
    private final DeviceLookupService lookupService;

    public DeviceManagementService(DeviceLookupService lookupService) {
        this.lookupService = lookupService;
    }

    public boolean addDevice(Network network, Device device) {
        if (device instanceof SmartDevice smartDevice &&
                !lookupService.deviceNameAvailable(network, smartDevice.getName())) {
            return false;
        }
        network.addDevice(device);
        return true;
    }
}
