package com.kraft.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_01 {
    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        /**{
         "appium:udid": "1699da64",
         "appium:version": "11",
         "appium:deviceName": "Redmi Note 8",
         "appium:realDevice": "false",
         "platformName": "Android"

         }
         */
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:udid","1699da64");
        capabilities.setCapability( "appium:version","11");
        capabilities.setCapability("appium:deviceName","Redmi Note 8");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:appPackage","com.getir.casestudy.dev");
        capabilities.setCapability("appium:appActivity","com.getir.casestudy.modules.splash.ui.SplashActivity");
        AppiumDriver<MobileElement> driver;
        driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        Thread.sleep(3000);
        MobileElement usernameBox= driver.findElement(By.xpath("//*[@text='username']"));
        MobileElement passwordBox= driver.findElement(By.xpath("//*[@text='password']"));
        MobileElement submitBtn= driver.findElement(By.xpath("//*[@text='Submit']"));
        Thread.sleep(3000);
        usernameBox.sendKeys("hello@getir.com");
        passwordBox.sendKeys("hello");
        submitBtn.click();


    }
}
