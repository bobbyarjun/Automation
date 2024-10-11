package com.automation.Automation2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	protected  ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

	public void setDriver(String name) throws IOException {
		if(name.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
			System.out.println("Browser setup by thread:"+Thread.currentThread()+getDriver());
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--headless");
			driver.set(new FirefoxDriver(options));
			System.out.println("Browser setup by thread:"+Thread.currentThread()+getDriver());
		}
	}
	public WebDriver getDriver() {
		return driver.get();
	}
}
