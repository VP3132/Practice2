package com.BasicPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		//AlertBox
//		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
//		//ConfirmBox
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		alt.dismiss();
		
		//PromotBox
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert alt1=driver.switchTo().alert();
		alt1.sendKeys("Hi Vinod Potdar");
		alt1.accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		
        driver.close();
	}

}
