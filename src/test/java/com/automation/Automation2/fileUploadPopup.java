package com.automation.Automation2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class fileUploadPopup  extends BaseClass{
	@Test
	public void fileUploadPopup() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(52));
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		File file = new File("./Data/Arjun R Resume_Tester.docx");
		if(file.exists())
			System.out.println("File Exists");
		driver.findElement(By.id("fileInput")).sendKeys(file.getAbsolutePath().toString());
	}

}
