package com.jju;
public class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String name) {
        super(name);
    }

    @Override
    public void activate() {
        
        System.out.println(getName() + " is setting temperature to 72 degrees.");
    }
}

