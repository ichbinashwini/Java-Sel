import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//div/a[@class='w3-bar-item w3-button ga-nav'][6]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Learn Java']")).getText(), "Learn Java");
		System.out.println("Found successfully");
		driver.close();

	}

}
