import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivity {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Actions a = new Actions(driver);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footerlinks = driver.findElement(By.id("gf-BIG"));
		
		int linkNos = footerlinks.findElements(By.tagName("a")).size();
		
		System.out.println(linkNos);
//---------------To click on each link in the footer------------------------------------------		
		
		int colInFooter = footerlinks.findElements(By.xpath("//table/tbody/tr/td[1]/ul")).size();
	
		for (int i=1; i<= 5; i++)
		{
			
			
			//a.moveToElement(footerlinks.findElements(By.tagName("a")).get(i)).keyDown(Keys.COMMAND).click().build().perform();
//----------either of above step or Keys logic below ---------------------------------------------	
			
			String clickOnTabLinks = Keys.chord(Keys.COMMAND , Keys.ENTER);
			footerlinks.findElements(By.tagName("a")).get(i).sendKeys(clickOnTabLinks);
			Thread.sleep(5000);
		}	
			Set <String> allWindows = driver.getWindowHandles();
			Iterator<String> it1 = allWindows.iterator();
			
			
			  while (it1.hasNext()){
			  
			  driver.switchTo().window(it1.next()); System.out.println(driver.getTitle());
			  
			  }
			 
			
		
		
	}
	

}
