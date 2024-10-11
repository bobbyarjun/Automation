package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class scrollingToElement extends BaseClass{
	@Test
	public void scrollingToElement() throws InterruptedException {
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("samsung 5g");
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
		int count=allsuggestions.size();
		System.out.println(count);
		for (WebElement suggestion:allsuggestions ) {
			System.out.println(suggestion.getText());
		}
		driver.findElement(By.xpath("//li[@class=\"_3D0G9a\"][1]")).click();
		List<WebElement> phonelist = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\" and contains(text(),'SAMSUNG')]"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\" and contains(text(),'SAMSUNG')]/../../div[2]/div[1]/div/div"));
		for(int i=0;i<phonelist.size();i++) {
			Actions action=new Actions(driver);
			action.scrollToElement(phonelist.get(i)).perform();
			System.out.println(phonelist.get(i).getText()+"-->"
					+ pricelist.get(i).getText());
		}
		driver.quit();
	}

}
