package com.codecool;

import com.codecool.data.*;
import com.codecool.service.DeviceLookupService;
import com.codecool.service.DeviceManagementService;
import com.codecool.service.PowerCalculationService;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        DeviceLookupService deviceLookupService = new DeviceLookupService();
        PowerCalculationService powerCalculationService = new PowerCalculationService();
        DeviceManagementService deviceManagementService = new DeviceManagementService(deviceLookupService);

        Network network = new Network();

        LightWeightDevice lightWeightDevice1 = new LightWeightDevice(
                network,
                LocalDate.of(1995, Month.DECEMBER, 1),
                38);

        LightWeightDevice lightWeightDevice2 = new LightWeightDevice(
                network,
                LocalDate.of(2020, Month.AUGUST, 30),
                178);

        NormalDevice normalDevice1 = new NormalDevice(network,
                LocalDate.of(1999, Month.DECEMBER, 31),
                100,
                ScreenSize.FHD);
        NormalDevice normalDevice2 = new NormalDevice(network,
                LocalDate.of(2000, Month.JANUARY, 1),
                100,
                ScreenSize.FHD);

        SmartDevice smartDevice1 = new SmartDevice(network,
                LocalDate.of(2028, Month.FEBRUARY, 29),
                100,
                "Smort Red Bull Can",
                ScreenSize.FHD);

        deviceManagementService.addDevice(network, lightWeightDevice1);
        deviceManagementService.addDevice(network, lightWeightDevice2);
        deviceManagementService.addDevice(network, normalDevice1);
        deviceManagementService.addDevice(network, normalDevice2);
        deviceManagementService.addDevice(network, smartDevice1);
        System.out.println(network.getDevices());

        System.out.println(deviceLookupService.getNormalDevices(network));
        System.out.println(deviceLookupService.getLightWeightDevices(network));

        System.out.println(powerCalculationService.calculate(normalDevice1));
        System.out.println(powerCalculationService.calculate(smartDevice1));
    }
}