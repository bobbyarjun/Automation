package com.automation.Automation2;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


/**
 * Unit test for simple App.
 */
public class BaseClass extends SetupDriver {
	private static final String URL = "https://demoapps.qspiders.com/";
	public static WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {

	      if (browser.equalsIgnoreCase("firefox")) {
	         System.out.println("Executing on FireFox");
	         setDriver(browser);
	         this.driver=getDriver();
	         this.driver.get(URL);
	         this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	         this.driver.manage().window().maximize();
	      } else if (browser.equalsIgnoreCase("chrome")) {
	         System.out.println(" Executing on CHROME");
	         setDriver(browser);
	         driver=getDriver();
	 		driver.get(URL);
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      }  else {
	         throw new IllegalArgumentException("The Browser Type is Undefined");
	      }
		
	}
	@AfterClass
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	}
