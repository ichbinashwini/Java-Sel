import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {
	// TODO - Select INDIA in dynamic dropdown

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		
		List<WebElement> ddOptions = driver.findElements(By.className("ui-menu-item"));
		
		for (WebElement each : ddOptions)
		{
			System.out.println("Inside for");
		
			System.out.println(each.getText());
		
			if (each.getText().equalsIgnoreCase("India"))
			{
				System.out.println("Found India");
				each.click();
				break;
				
			}
			
		}
		
		Thread.sleep(5000);	
		System.out.println("Selected text = " +driver.findElement(By.id("autocomplete")).getText());
		driver.close();
			
			
			
		}

}
