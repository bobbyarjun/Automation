package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class scrollingToElement extends BaseClass{
	@Test
	public void scrollingToElement() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("samsung 5g");
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"))));
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
		int count=allsuggestions.size();
		System.out.println(count);
		for (WebElement suggestion:allsuggestions ) {
			System.out.println(suggestion.getText());
		}
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@class=\"_3D0G9a\"][1]"))));
		driver.findElement(By.xpath("//li[@class=\"_3D0G9a\"][1]")).click();
		List<WebElement> phonelist = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\" and contains(text(),'SAMSUNG')]"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\" and contains(text(),'SAMSUNG')]/../../div[2]/div[1]/div/div"));
		for(int i=0;i<phonelist.size();i++) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", phonelist.get(i));
			System.out.println(phonelist.get(i).getText()+"-->"
					+ pricelist.get(i).getText());
		}
		driver.quit();
	}

}
