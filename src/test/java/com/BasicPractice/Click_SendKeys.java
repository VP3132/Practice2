package com.BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_SendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Vinod");
		driver.findElement(By.id("lastName")).sendKeys("Potdar");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.name("email")).sendKeys("VinodPotdar96@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vinod@3132");
		driver.findElement(By.id("registerbtn")).click();
		driver.close();

	}

}
