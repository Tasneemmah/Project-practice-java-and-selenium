package automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstproject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.out.println(driver.findElement(By.id("label-one")).getText().toUpperCase());
		driver.get("http://127.0.0.1:5502/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email-input")).sendKeys("tasneemmahmuod@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("tasNeeMM98");
		driver.findElement(By.id("date-input")).sendKeys("17-5-1998");
		driver.findElement(By.id("mobile-input")).sendKeys("078876549");
		
		driver.findElement(By.tagName("button")).click();

	}
}