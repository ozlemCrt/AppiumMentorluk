package com.kraft.tests;

        import com.kraft.utils.App;
        import com.kraft.utils.Device;
        import com.kraft.utils.Driver;
        import com.kraft.utils.Utils;
        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.MobileElement;
        import org.openqa.selenium.By;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;

        import java.net.MalformedURLException;
        import java.util.concurrent.TimeUnit;

public class Test_07 {

    Device device= Device.Redmi_8;
    App app= App.Getir;
    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    By lusername=By.xpath("//*[@text='username']");
    By lyiyecek=By.xpath("//*[@text='Yiyecek']");
    By lurun32=By.xpath("//*[@text='Ürün 32']");
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(lyiyecek)).click();
Utils.swipeUntil(lurun32,.6,.3);





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
