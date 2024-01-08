import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		

		// From Departure city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='PAT']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
//------- to check if enabled------------------------
		
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style")); //Check style attribute before clicking
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  //Click on one way
		
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		
		if (driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Element is disabled");
			Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("Element is enabled");
			Assert.assertFalse(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.close();
		
		
		
	}
	

}
