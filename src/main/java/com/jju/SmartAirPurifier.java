package com.jju;
public class SmartAirPurifier extends SmartDevice {
    public SmartAirPurifier(String name) {
        super(name);
    }

    @Override
    public void activate() {
        System.out.println(getName() + " is purifying the air.");
    }
    
}