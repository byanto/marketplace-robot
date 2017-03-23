package com.aigootan.marketplace;

import org.openqa.selenium.WebDriver;

import com.aigootan.marketplace.tokopedia.MarketplaceDriverTokopedia;
import com.aigootan.marketplace.util.Util;

import constant.Constant.BROWSER;
import constant.Tokopedia;

public class TokopediaTester {
	public static void main(String[] args) {
		final WebDriver driver = Util.getWebDriver(BROWSER.CHROME);
		//driver.get(Tokopedia.URL_HOME);
		final MarketplaceDriverTokopedia tokped = new MarketplaceDriverTokopedia(driver);
		//tokped.login("globalfashion.id@gmail.com", "EZHhYanpBQyw3zuN");
//		tokped.collectStoreInfo("myonlineshops");
		tokped.collectStoreInfo("lapaklaris");
	}
}
