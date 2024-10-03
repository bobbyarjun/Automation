package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class HiddenDivision extends BaseClass {
	@Test
	public void HiddenDivision() {
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class=\"bg-white p-4 rounded-lg shadow-md z-50 w-[40%] \"]")));
		driver.findElement(By.xpath("//input[@class=\"w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md\"]")).sendKeys("arjun");
		driver.findElement(By.xpath("//input[@class='w-full m-2 h-10 px-4 border-2 border-stone-600 rounded-md']")).sendKeys("rarjun96@gmail.com");
		Select select=new Select(driver.findElement(By.xpath("//select[@required]")));
		select.selectByVisibleText("Mobile");
		driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
