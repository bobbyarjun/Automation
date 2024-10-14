package com.automation.Automation2;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


/**
 * Unit test for simple App.
 */
public class BaseClass extends SetupDriver {
	private static final String URL = "https://demoapps.qspiders.com/";
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws IOException {

		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Executing on FireFox");
			setDriver(browser);
			driver=getDriver();
			if(getClass().getSimpleName().contains("printAllAutoSuggestions") || getClass().getSimpleName().contains("scrollingToElement")){
				driver.get("https://www.flipkart.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}
			else if(getClass().getSimpleName().contains("Demo")){
				driver.get("https://secure.indeed.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}
			else {
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Executing on CHROME");
			setDriver(browser);
			driver=getDriver();
			if(getClass().getSimpleName().contains("printAllAutoSuggestions") || getClass().getSimpleName().contains("scrollingToElement")){
				driver.get("https://www.flipkart.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}
			else if(getClass().getSimpleName().contains("Demo")){
				driver.get("https://secure.indeed.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}
			else {
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
			}

		}  else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}

	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
