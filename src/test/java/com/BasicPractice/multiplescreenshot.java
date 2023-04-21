package com.BasicPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplescreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.edureka.co");
		takescreenshot("edureka");
		System.out.println("Sc Done");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://synoptek.com/");
        driver.quit();
        driver.manage().window().getSize();
	}

	public static void takescreenshot(String name) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File file = sc.getScreenshotAs(OutputType.FILE);
		File source = new File("D:\\ScreenSchot" + name + ".png");
		FileUtils.copyFile(file, source);
	}

}
