package com.bvk.bridge;

public abstract class BinatangAir implements Binatang {

    @Override
    public boolean hidupDiAir() {
        return true;
    }

    @Override
    public boolean hidupDiDarat() {
        return false;
    }
}
