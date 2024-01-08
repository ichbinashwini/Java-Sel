import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
			
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		  driver.get("https://www.path2usa.com/travel-companion/");
		  
		 // Thread.sleep(7000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1100);");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(".//*[@id = 'form-field-travel_comp_date']")).click();
		  List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
			
			
			
			
			String month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
			System.out.println(month);
			
			
			while(!(driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("January")))
			{
				driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
				
				System.out.println(driver.findElement(By.xpath("//span[@class='cur-month']")).getText());
			}
			
			int count = driver.findElements(By.className("flatpickr-day")).size();
			System.out.println(count);
			for (int i=1; i<count;i++)
			{
				Thread.sleep(3000);
				String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
				
				System.out.println("Found date"+ text);
				if(text.equalsIgnoreCase("22"))
				{
					driver.findElements(By.className("flatpickr-day")).get(i).click();
					Thread.sleep(5000);				
					System.out.println("Found the date");
					break;
				}
			}
			System.out.println(driver.findElement(By.xpath(".//*[@id = 'form-field-travel_comp_date']")).getText());
			
			driver.close();
		 

	}

}

