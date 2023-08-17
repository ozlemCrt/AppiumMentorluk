package com.kraft.tests;

import com.kraft.utils.App;
import com.kraft.utils.Device;
import com.kraft.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_06 {

    Device device= Device.Redmi_8;
    App app= App.Getir;
    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    By lusername=By.xpath("//*[@text='username']");
    @BeforeTest
    public void beforeTest(){
        Driver.runAppiumService();
        driver=Driver.getDriver(device,app);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);

    }
    @AfterTest
    public void afterTest(){
        driver.closeApp();
        Driver.stopAppiumService();


    }

    @Test
    public void test1()  {

     wait.until(ExpectedConditions.visibilityOfElementLocated(lusername));

        MobileElement usernameBox= driver.findElement(lusername);
        MobileElement passwordBox= driver.findElement(By.xpath("//*[@text='password']"));
        MobileElement submitBtn= driver.findElement(By.xpath("//*[@text='Submit']"));

        usernameBox.sendKeys("hello@getir.com");
        passwordBox.sendKeys("hello");
        submitBtn.click();





    }

}
