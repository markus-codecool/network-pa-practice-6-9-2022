package com.codecool.data;

import java.time.LocalDate;

public class NormalDevice extends Device {
    private final static int YEARLY_BATTERY_LOSS = 3;
    private final ScreenSize screenSize;

    public NormalDevice(Network network, LocalDate manufactureDate, int originalBatteryLife, ScreenSize screenSize) {
        super(network, manufactureDate, originalBatteryLife, YEARLY_BATTERY_LOSS);
        this.screenSize = screenSize;
    }

    public ScreenSize getScreenSize() {
        return screenSize;
    }
}
