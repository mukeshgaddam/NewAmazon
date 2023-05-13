package com.amazon.qa.factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver driver;
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome driver started");

		
	}
	

}
