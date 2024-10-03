package com.automation.Automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetupDriver {
	protected static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
public void setDriver(String name) {
if(name.contains("chrome")) {
	ChromeOptions options =new ChromeOptions();
    options.addArguments("--headless");
	driver.set(new ChromeDriver(options));
	System.out.println("Browser setup by thread:"+Thread.currentThread()+getDriver());
}
else {
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
