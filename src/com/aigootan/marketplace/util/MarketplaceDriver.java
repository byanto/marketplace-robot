package com.aigootan.marketplace.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.aigootan.marketplace.model.Store;


public abstract class MarketplaceDriver {
     
    private final WebDriver m_driver;

    protected MarketplaceDriver(final WebDriver driver) {
        m_driver = driver;
    }
    
    protected abstract boolean isLogin();
    
    protected abstract void login(final String username, final String password);
    
    protected abstract Store collectStoreInfo(final String storeName);
    
    protected boolean existsById(String id) {
        try {
            getDriver().findElement(By.id(id)).isDisplayed();
        } catch(NoSuchElementException ex) {
            return false;
        }
        
        return true;
    }
    
    public WebDriver getDriver() {
        return m_driver;
    }
    
}
