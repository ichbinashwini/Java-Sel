import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		Set<String> originalWindow = driver.getWindowHandles();
		System.out.println(originalWindow);

		Iterator <String> it = originalWindow.iterator();
		
		String ParentWindow = it.next();
		
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		String targetName = driver.findElements(By.cssSelector("a[href*= 'https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(targetName);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		driver.quit();
		}

}
