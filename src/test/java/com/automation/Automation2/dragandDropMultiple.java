package com.automation.Automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class dragandDropMultiple extends BaseClass {
	@Test

	public  void dragandDropMultiple() throws AWTException, InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(52));
		driver.findElement(By.xpath("(//div[.='Explore more'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.linkText("Drag & Drop")).click();
		driver.findElement(By.linkText("Drag Multiple")).click();
		driver.findElement(By.xpath("//div[.='Laptop Charger']")).click();
		driver.findElement(By.xpath("//div[.='Laptop Cover']")).click();
		WebElement source = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement target = driver.findElement(By.id("dropZone1"));
		  String script = "function createEvent(typeOfEvent) {" +
                  "var event = document.createEvent('CustomEvent');" +
                  "event.initCustomEvent(typeOfEvent, true, true, null);" +
                  "event.dataTransfer = {" +
                  "data: {}," +
                  "setData: function(key, value) { this.data[key] = value; }," +
                  "getData: function(key) { return this.data[key]; }" +
                  "};" +
                  "return event;" +
                  "}" +
                  "function dispatchEvent(element, event, transferData) {" +
                  "if (transferData !== undefined) {" +
                  "event.dataTransfer = transferData;" +
                  "}" +
                  "element.dispatchEvent(event);" +
                  "}" +
                  "var dragStartEvent = createEvent('dragstart');" +
                  "dispatchEvent(arguments[0], dragStartEvent);" +
                  "var dropEvent = createEvent('drop');" +
                  "dispatchEvent(arguments[1], dropEvent, dragStartEvent.dataTransfer);" +
                  "var dragEndEvent = createEvent('dragend');" +
                  "dispatchEvent(arguments[0], dragEndEvent);";

  ((JavascriptExecutor) driver).executeScript(script, source, target);
		driver.findElement(By.xpath("//div[.='Mobile Cover']")).click();
		driver.findElement(By.xpath("//div[.='Mobile Charger']")).click();
		WebElement sourcce = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement targett = driver.findElement(By.id("dropZone2"));
  ((JavascriptExecutor) driver).executeScript(script, source, target);
	}

}
