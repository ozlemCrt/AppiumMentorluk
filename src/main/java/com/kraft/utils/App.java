package com.kraft.utils;

public enum App {

    Getir("com.getir.casestudy.dev","com.getir.casestudy.modules.splash.ui.SplashActivity"),
    CALCULATOR("com.miui.calculator", "com.miui.calculator.cal.CalculatorActivity");
    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage=appPackage;
        this.appActivity=appActivity;
    }
}
