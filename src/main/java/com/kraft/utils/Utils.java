package com.kraft.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.kraft.utils.Driver.*;

public class Utils {
    static AppiumDriver<MobileElement> driver=Driver.getDriver();
    public static AppiumDriver<MobileElement> openApp(Device device,App app){
        Driver.runAppiumService();
        return getDriver(device, app);
    }
    public static void swipev(double starPoint,double endPoint){
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        new TouchAction<>(driver)
                .press(PointOption.point(width/2, (int) (height*starPoint)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(width/2, (int) (height*endPoint)))
                .release().perform();



    }


    public static void swipeUntil(By locater,double start,double end){
        while (driver.findElements(locater).size()<=0){
            swipev(start,end);

        }

    }
}
