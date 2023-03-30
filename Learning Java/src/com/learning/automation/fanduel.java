package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class fanduel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fanduel.com");
		
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.nba.com");
			
			driver.switchTo() .newWindow(WindowType.TAB);
			driver.get("https://www.nfl.com/schedule");

	}

}
