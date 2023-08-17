package com.kraft.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
    static AppiumDriverLocalService service;
    private static AppiumDriver<MobileElement> driver;
    public static void runAppiumService(){
        service=new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                //.usingPort(4723)
                .usingAnyFreePort()
                .build();
        service.clearOutPutStreams(); //Konsolda log akışı olmaz
        service.start();
    }
    public static void stopAppiumService(){
        service.stop();
    }

    public static AppiumDriver<MobileElement> getDriver(Device device,App app){
        driver=new AndroidDriver<MobileElement>(service.getUrl(),setcapabilities(device, app));
        return driver;

    }

    private static DesiredCapabilities setcapabilities(Device device,App app){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:udid",device.udid);
        capabilities.setCapability( "appium:version",device.version);
        capabilities.setCapability("appium:deviceName",device.deviceName);
        capabilities.setCapability("platformName",device.platformName);
        capabilities.setCapability("appium:appPackage",app.appPackage);
        capabilities.setCapability("appium:appActivity",app.appActivity);
        return  capabilities;

    }
    public static AppiumDriver<MobileElement> getDriver(){

        return driver;

    }


}
