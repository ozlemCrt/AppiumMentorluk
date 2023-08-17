package com.kraft;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMobile {
    private static WebDriver driver;
    public static WebDriver getMobileWebDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.setExperimentalOption("androidPackage","com.android.chrome");
            driver=new ChromeDriver(options);

        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
