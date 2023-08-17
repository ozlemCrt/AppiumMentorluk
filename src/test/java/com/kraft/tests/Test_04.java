package com.kraft.tests;

import com.kraft.utils.App;
import com.kraft.utils.Device;
import com.kraft.utils.Driver;
import com.kraft.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_04 {
    AppiumDriverLocalService service;
    Device device= Device.Redmi_8;
    App app= App.Getir;
    AppiumDriver<MobileElement> driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        Driver.runAppiumService();
        driver=Driver.getDriver(device,app);
        Thread.sleep(3000);
        MobileElement usernameBox= driver.findElement(By.xpath("//*[@text='username']"));
        MobileElement passwordBox= driver.findElement(By.xpath("//*[@text='password']"));
        MobileElement submitBtn= driver.findElement(By.xpath("//*[@text='Submit']"));
        Thread.sleep(3000);
        usernameBox.sendKeys("hello@getir.com");
        passwordBox.sendKeys("hello");
        submitBtn.click();
        driver.closeApp();
        Driver.stopAppiumService();





    }
    @Test
    public void test2() throws MalformedURLException, InterruptedException {
       driver= Utils.openApp(device,app);
        Thread.sleep(3000);
        MobileElement usernameBox= driver.findElement(By.xpath("//*[@text='username']"));
        MobileElement passwordBox= driver.findElement(By.xpath("//*[@text='password']"));
        MobileElement submitBtn= driver.findElement(By.xpath("//*[@text='Submit']"));
        Thread.sleep(3000);
        usernameBox.sendKeys("hello@getir.com");
        passwordBox.sendKeys("hello");
        submitBtn.click();
        driver.closeApp();
      Driver.stopAppiumService();

    }
}
