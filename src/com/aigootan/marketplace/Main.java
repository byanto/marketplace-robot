package com.aigootan.marketplace;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "driver/geckodriver");
		final Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					"//Users//budiyanto//Downloads//phantomjs-2.1.1-macosx//bin//phantomjs");
		final WebDriver driver = new PhantomJSDriver(caps);		
		String url1 = "http://www.google.com";
		String url2 = "http://www.tokopedia.com";
		driver.get(url2);
		
		final String tokopediaStartPageTitle = "Jual Beli Online Aman dan Nyaman - Tokopedia";
		
		if(tokopediaStartPageTitle.equals(driver.getTitle())) {
			System.out.println("Correct Start Page - Tokopedia");
		} else {
			System.out.println("Wrong Start Page - Not Tokopedia");
		}
		
		String email = "aigootan@gmail.com";
		String pass = "Gotan88";
		
		WebElement loginElem = driver.findElement(By.id("login-ddl-link"));
		
		// User is not logged in, so log in first
		if(loginElem.isDisplayed()) {
			final String loginPage = "https://accounts.tokopedia.com/login";
			driver.get(loginPage);
//			loginElem.click();
//			WebDriverWait waitVar = new WebDriverWait(driver, 3);
//			waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputEmail")));
			final WebElement emailElem = driver.findElement(By.id("inputEmail"));
			emailElem.sendKeys(email);
			final WebElement passElem = driver.findElement(By.id("inputPassword"));
			passElem.sendKeys(pass);
			passElem.submit();
			
			final boolean successLogin = driver.findElement(By.id("notification")).isDisplayed();
			System.out.println("Success Login: " + successLogin);
			
			promoteItem(driver, "https://www.tokopedia.com/aigootan/penutup-makanan-penutup-piring-food-cover");
			
			
		} else { // User has logged in, proceed to promote item
			System.out.println("User has logged in");
		}


		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("HOREE");
		driver.quit();
	}

	private static void promoteItem(final WebDriver driver, final String url){
		driver.get(url);
		final WebElement dinkItElem = driver.findElement(By.id("dink-it"));
		if(dinkItElem.isDisplayed()) {
			System.out.println("Dink-It Exists");
			dinkItElem.click();
		} else {
			System.out.println("No Dink-It");
		}
	}
	
}

