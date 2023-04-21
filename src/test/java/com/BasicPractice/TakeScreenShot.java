package com.BasicPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.internal.Utils;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
        driver.quit();
//        driver.close();
	}

}
