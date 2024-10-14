package com.automation.Automation2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class printAllAutoSuggestions  extends BaseClass{
	@Test

	public void printAllSughestions() {
		driver.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).sendKeys("samsung m32 5g");
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc\"]/li"));
		int count=allsuggestions.size();
		System.out.println(count);
		for (WebElement suggestion:allsuggestions ) {
			System.out.println(suggestion.getText());
		}
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		List<WebElement> phonelist = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\" and contains(text(),'SAMSUNG M32 5G')]"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[starts-with(text(),'SAMSUNG M32 5G')]/../../descendant::div[7]"));
		for(int i=0;i<phonelist.size();i++) {
			System.out.println(phonelist.get(i).getText()+"-->"
					+ pricelist.get(i).getText());
		}

	}

}
