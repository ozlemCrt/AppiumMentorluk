package com.kraft.cucumber;

import com.kraft.utils.App;
import com.kraft.utils.Device;
import com.kraft.utils.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class calStepDefs {
    AppiumDriver<?> driver;
    @Given("The user is start page")
    public void theUserIsStartPage() {
        driver= Utils.openApp(Device.Redmi_8, App.CALCULATOR);

    }

    @When("The user sum of following numbers")
    public void theUserSumOfFollowingNumbers(DataTable table) {
        List<Integer>list=table.asList(Integer.class);
        driver.findElement(By.id("android:id/button1")).click();

        click(list.get(0));
        click("plus");
        click(list.get(1));
        click("plus");
        click(list.get(2));
        click("equal");

    }



    public void click(int num){
        driver.findElement(By.id("com.miui.calculator:id/btn_"+num+"_s")).click();
    }
    public void click(String operation){
        driver.findElement(By.id("com.miui.calculator:id/btn_"+operation+"_s")).click();
    }

    @Then("The result should be {string}")
    public void theResultShouldBe(String expectedresult) {
        String actualResult=driver.findElement(By.id("com.miui.calculator:id/result")).getText();
        Assert.assertEquals(actualResult,expectedresult);

    }
}
