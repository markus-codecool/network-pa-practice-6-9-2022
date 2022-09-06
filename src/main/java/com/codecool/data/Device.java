package com.codecool.data;

import java.time.LocalDate;

public abstract class Device {
    private final Network network;
    private final LocalDate manufactureDate;
    private final int originalBatteryLife;
    private final int yearlyBatteryLoss;

    protected Device(Network network, LocalDate manufactureDate, int originalBatteryLife, int yearlyBatteryLoss) {
        this.network = network;
        this.manufactureDate = manufactureDate;
        this.originalBatteryLife = originalBatteryLife;
        this.yearlyBatteryLoss = yearlyBatteryLoss;
    }

    public Network getNetwork() {
        return network;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public int getOriginalBatteryLife() {
        return originalBatteryLife;
    }

    public int getYearlyBatteryLoss() {
        return yearlyBatteryLoss;
    }
}
