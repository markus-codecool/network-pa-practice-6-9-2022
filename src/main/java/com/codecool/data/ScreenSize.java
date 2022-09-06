package com.codecool.data;

public enum ScreenSize {
    EDTV(5), HD(10), FHD(15), UHD(20);

    private final int fixedBatteryLoss;
    ScreenSize(int fixedBatteryLoss) {
        this.fixedBatteryLoss = fixedBatteryLoss;
    }

    public int getFixedBatteryLoss() {
        return fixedBatteryLoss;
    }
}
