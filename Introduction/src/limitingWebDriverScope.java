import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class limitingWebDriverScope {
		

		public static void main (String[] args) {
			    WebDriver driver;
			
			    driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				System.out.println(driver.getTitle()); 
				
				WebElement footer = driver.findElement(By.id("gf-BIG"));
			
				int noOfLinks = footer.findElements(By.tagName("a")).size();
				System.out.println(noOfLinks);
				
				WebElement fcol1 = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				
				int fcLinks = fcol1.findElements(By.tagName("a")).size();
				
				System.out.println(fcLinks);
				

				
				
				for (int i = 1; i<fcLinks; i++)
				{
					String clickOnLink = Keys.chord(Keys.COMMAND,Keys.ENTER);
					fcol1.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
					
					
				}	
					Set<String> windows = driver.getWindowHandles();
					
					Iterator<String> it = windows.iterator();
					
					while (it.hasNext())
					{
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
						
						
					}
					
				
					
				
				
				driver.close();
				System.out.println("Done");
			
			
		}


}
