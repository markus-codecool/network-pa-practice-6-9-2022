package com.codecool.data;

import java.time.LocalDate;

public class SmartDevice extends Device {
    private final static int YEARLY_BATTERY_LOSS = 15;
    private final String name;
    private final ScreenSize screenSize;

    public SmartDevice(Network network, LocalDate manufactureDate, int originalBatteryLife, String name, ScreenSize screenSize) {
        super(network, manufactureDate, originalBatteryLife, YEARLY_BATTERY_LOSS);
        this.name = name;
        this.screenSize = screenSize;
    }

    public ScreenSize getScreenSize() {
        return screenSize;
    }

    public String getName() {
        return name;
    }
}
