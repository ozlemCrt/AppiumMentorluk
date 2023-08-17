package com.kraft.utils;

public enum Device {

    Redmi_8("1699da64","11","Redmi Note 8","Android");
    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
