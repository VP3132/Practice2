package com.BasicPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.switchTo().newWindow(WindowType.TAB);

		String Youtub = "https://www.youtube.com/";
		String TestJb = "https://www.testingsjobs.com/";

		driver.get(TestJb);
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get(Youtub);
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> Window = driver.getWindowHandles();

		for (String wind : Window) {
			System.out.println(wind);

		}
		Iterator<String> Handels = Window.iterator();

		String st = Handels.next();
		String nd = Handels.next();
		String rd = Handels.next();

		driver.switchTo().window(st);
		Thread.sleep(2000);

		driver.switchTo().window(nd);
		Thread.sleep(2000);

		driver.switchTo().window(rd);
		Thread.sleep(2000);

		driver.close();
	}

}
