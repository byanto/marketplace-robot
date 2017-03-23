package com.aigootan.marketplace.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import constant.Constant.BROWSER;

public class Util {
    
    public static WebDriver getWebDriver(BROWSER browser) {
        final Capabilities caps;
        switch(browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "file/chromedriver");
                caps = new DesiredCapabilities();
                ((DesiredCapabilities) caps).setJavascriptEnabled(true);
                return new ChromeDriver(caps);                    
            case PHANTOMJS:
                caps = new DesiredCapabilities();
                ((DesiredCapabilities) caps).setJavascriptEnabled(true);
                ((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                            "file//phantomjs");
                return new PhantomJSDriver(caps);
            default:
                return null;
        }
    }
    
    public static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
}
