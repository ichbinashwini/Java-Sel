import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//-----------------------implicit wait-------------------------------------------------------------------		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//----------------Explicit Wait---------------------------------------------------------------------------
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofMillis(3000));
		
		
		String[] vegggisToBuy = {"Tomato","Beans"};
		//Thread.sleep(3000);
		base b = new base();
		b.addItems(driver, vegggisToBuy);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()= 'PROCEED TO CHECKOUT']")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }


public void addItems(WebDriver driver, String[] vegggisToBuy)
{
	
	List vegggisToBuyList = Arrays.asList(vegggisToBuy);
	
	int j = 0;
	
	List<WebElement> getList = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
	
	for(int i = 0; i< getList.size(); i++)
	{
		j++;
		String[] vegName = getList.get(i).getText().split("-");
		String trimmed = vegName[0].trim();
		
		if (vegggisToBuyList.contains(trimmed)) 
		{
			
		driver.findElements(By.xpath("//div[@class= 'product-action']")).get(i).click();
		
			if (j == vegggisToBuy.length) 
				break;
			
		
	    }
	
   }
	

}




}
