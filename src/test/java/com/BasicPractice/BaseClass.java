package com.BasicPractice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static void CapturesScreenShot(WebDriver driver,String FileName) {
		TakesScreenshot Tc = (TakesScreenshot) driver;
		File file = Tc.getScreenshotAs(OutputType.FILE);
		File Store = new File("./ScreenShot/"+FileName+"");	
	}
	}

