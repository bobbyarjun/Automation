package com.automation.Automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class handlingModelPopup extends BaseClass{

	@Test
	public  void handlingModelPopup() {
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Modal']")).click();
		driver.findElement(By.id("modal1")).click();
		System.out.println(driver.findElement(By.xpath("//section[@class=\"py-4 pb-4 border-b-[1px]\"]/p")).getText());
		driver.findElement(By.id("closeModal")).click();

	}

}
