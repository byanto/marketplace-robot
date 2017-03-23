package com.aigootan.marketplace.tokopedia;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aigootan.marketplace.model.Owner;
import com.aigootan.marketplace.model.Store;
import com.aigootan.marketplace.util.MarketplaceDriver;
import com.aigootan.marketplace.util.Util;

import constant.Tokopedia;

public class MarketplaceDriverTokopedia extends MarketplaceDriver {

    public MarketplaceDriverTokopedia(final WebDriver driver) {
        super(driver);
    }

    @Override
    public void login(final String username, final String password) {
        final WebDriver driver = getDriver();
        driver.get(Tokopedia.URL_LOGIN);
        Util.delay(2);
        driver.findElement(By.id(Tokopedia.BY_ID_LOGIN_EMAIL)).sendKeys(username);
        Util.delay(2);
        final WebElement passField = driver.findElement(By.id(Tokopedia.BY_ID_LOGIN_PASSWORD));
        passField.sendKeys(password);
        Util.delay(1);
        passField.submit();
        Util.delay(5);
    }

    @Override
    public boolean isLogin() {        
        if(existsById(Tokopedia.BY_ID_LOGIN_BTN)) {
            return true;
        }
        return false;
    }

    @Override
    public Store collectStoreInfo(final String storeID) {
        final String urlStore = Tokopedia.URL_HOME + "/" + storeID ; 
        final WebDriver driver = getDriver();
        driver.get(urlStore + "/" + Tokopedia.URL_STORE_INFO_SUFFIX);
        Util.delay(2);
        WebElement elem = driver.findElement(By.xpath(Tokopedia.BY_XPATH_SHOP_OWNER));
        final Owner owner = new Owner(elem.getText(), elem.getAttribute("href"));
        
        long totalTransaction = -1, totalSoldProduct = -1;
        int totalEtalase = -1, totalProduct = -1;
        try {
            NumberFormat usLocale = NumberFormat.getNumberInstance(Locale.US);
            totalTransaction = usLocale.parse(driver.findElement(By.xpath(Tokopedia.BY_XPATH_TOTAL_SUCCESSFUL_TRANSACTION)).getText()).longValue();
            totalSoldProduct = usLocale.parse(driver.findElement(By.xpath(Tokopedia.BY_XPATH_TOTAL_SOLD_PRODUCTS)).getText()).longValue();
            totalEtalase = usLocale.parse(driver.findElement(By.xpath(Tokopedia.BY_XPATH_TOTAL_ETALASE)).getText()).intValue();
            totalProduct = usLocale.parse(driver.findElement(By.xpath(Tokopedia.BY_XPATH_TOTAL_PRODUCTS)).getText()).intValue();
        } catch(ParseException ex) {
            
        }
       
        final String sendDuration = driver.findElement(By.xpath(Tokopedia.BY_XPATH_SHIPPING_INFO)).getText();
        final String lastOnline = driver.findElement(By.xpath(Tokopedia.BY_XPATH_LAST_ONLINE)).getText();
        final String sendFrom = driver.findElement(By.xpath(Tokopedia.BY_XPATH_SEND_FROM)).getText();
        final String openSince = driver.findElement(By.xpath(Tokopedia.BY_XPATH_OPEN_SINCE)).getText();
        final String reputationPoints = driver.findElement(By.xpath(Tokopedia.BY_XPATH_REPUTATION_POINTS)).getAttribute("data-original-title");
        final String favoriteShops = driver.findElement(By.xpath(Tokopedia.BY_XPATH_FAVORITE_SHOP)).getText();
        
        return new TokopediaStore(owner, storeID, "TODO", urlStore, totalTransaction, totalSoldProduct, totalEtalase, 
                totalProduct, sendFrom, sendDuration, lastOnline, openSince, reputationPoints, favoriteShops);
        
        
//        System.out.println("Owner Name: " + elem.getText());
//        System.out.println("Owner URL: " + elem.getAttribute("href"));
//        System.out.println();
//        
//        System.out.println("Shipping Info: " + shippingInfo);
//        System.out.println("Last Online: " + lastOnline);
//        System.out.println("Send From: " + sendFrom);
//        System.out.println("Open Since: " + openSince);
//        System.out.println();
        
//        System.out.println("Transaksi Sukses: " + totalTransaction);
//        System.out.println("Produk Terjual: " + totalSoldProducts);
//        System.out.println("Total Etalase: " + totalEtalase);
//        System.out.println("Total Produk: " + totalProducts);
//        System.out.println();
//        
//        System.out.println("Reputation Points: " + reputationPoints);
//        System.out.println("Favorite Shops: " + favoriteShops);
               
    }
    
}
