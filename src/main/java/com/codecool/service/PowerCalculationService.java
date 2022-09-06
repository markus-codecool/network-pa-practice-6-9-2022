package com.codecool.service;

import com.codecool.data.Device;
import com.codecool.data.Network;
import com.codecool.data.NormalDevice;
import com.codecool.data.SmartDevice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Set;

public class PowerCalculationService {
    public double calculate(Device device) {
        return switch (device) {
            case NormalDevice normalDevice -> calculate(normalDevice);
            case SmartDevice smartDevice -> calculate(smartDevice);
            default -> throw new IllegalStateException("cannot work with given device class");
        };
    }

    private int getDeviceAge(Device device) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(device.getManufactureDate(), now);
        return period.getYears();
    }

    private double calculate(NormalDevice normalDevice) {
        int age = getDeviceAge(normalDevice);
        double remainingPower = normalDevice.getOriginalBatteryLife() - age * normalDevice.getYearlyBatteryLoss();
        LocalDate threshold = LocalDate.of(2000, Month.JANUARY, 1);
        if (normalDevice.getManufactureDate().isBefore(threshold)) {
            remainingPower /= 2;
        } else {
            remainingPower *= 2;
        }
        return remainingPower;
    }

    public Set<NormalDevice> getNormalDevicesWithinRange(Network network, int minPower, int maxPower) {
        // TODO
        return null;
    }
}
