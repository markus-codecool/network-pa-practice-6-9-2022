package com.codecool.data;

import java.time.LocalDate;

public class LightWeightDevice extends Device {
    private final static int YEARLY_BATTERY_LOSS = 7;

    public LightWeightDevice(Network network, LocalDate manufactureDate, int originalBatteryLife) {
        super(network, manufactureDate, originalBatteryLife, YEARLY_BATTERY_LOSS);
    }
}
