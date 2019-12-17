package com.selenium.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSelenium {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
