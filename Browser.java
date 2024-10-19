package Basics;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {

		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.quit();
		
		WebDriver driver1= WebDriverManager.firefoxdriver().create();
		driver1.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
	}

}
