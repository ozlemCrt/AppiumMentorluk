package test.day1;

import com.kraft.WebDriverMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class MobileChromeTest {
    WebDriver driver= WebDriverMobile.getMobileWebDriver();
    @Test
    public void tets1(){
        driver.get("https://www.krafttechexlab.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("orhan");
        driver.findElement(By.id("yourpassword")).sendKeys("fght"+ Keys.TAB);
        driver.findElement(By.xpath("//*[text()='Login']")).click();


    }


}
