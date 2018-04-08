package com.kavi.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MySeleniumTest {
    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","D:\\\\kavi\\selenium\\libs\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("Title should starts with Selenium Simplified",
                webDriver.getTitle().startsWith("Selenium Simplified"));
        webDriver.close();
    }

    public void startWithOptions(){
        // System.setProperty("webdriver.firefox.bin","C:\\Users\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        //C:\Program Files\Mozilla Firefox
        //System.setProperty("webdriver.firefox.bin","C:\\\\Program Files\\Mozilla Firefox\\firefox.exe");
//        System.setProperty("webdriver.gecko.driver","D:\\\\kavi\\selenium\\libs\\chromedriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\\\Program Files\\Mozilla Firefox\\firefox.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("moz:firefoxOptions", options);
    }
}
