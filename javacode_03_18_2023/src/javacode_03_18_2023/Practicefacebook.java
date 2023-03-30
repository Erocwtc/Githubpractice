package javacode_03_18_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Practicefacebook {
	
	public WebDriver driver;
	public Select select;
	
	
	@BeforeMethod
	
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	
	@Test
	driver.findElement(By.xpath("//select[@id = 'month']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select/option[@value = '12' and text()='Dec']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id= 'day']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select/option[@value= '14']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id = 'year']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select/option[@value = '1987']")).click();
	Thread.sleep(2000);

}
