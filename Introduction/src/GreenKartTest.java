import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKartTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(2000);
		
		String[] needToAdd = {"Cucumber","Beetroot","Brocolli", "Beans"};
		
		int numberOfItems = 0;
		
		
		for (int i=0; i<veggies.size(); i++)
		{
			String[] selectedVeggi = veggies.get(i).getText().split("-");
			String trimmedName = selectedVeggi[0].trim();
			
			 List itemsNeededList = Arrays.asList(needToAdd);
			
			
			if (itemsNeededList.contains(trimmedName))
			{
				numberOfItems ++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				Thread.sleep(2000);
				if (numberOfItems == needToAdd.length)
					break;
			}
			
			
		}
		
		System.out.println(numberOfItems);
		driver.close();
		
		
		
	}

}
