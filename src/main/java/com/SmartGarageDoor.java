package com.jju;
public class SmartGarageDoor extends SmartDevice {
    public SmartGarageDoor(String name) {
        super(name);
    }
    
    @Override
    public void activate() {
        System.out.println(getName() + " is opening the garage door.");
    }
}