import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator <String> it = allWindows.iterator();
		String w1 = it.next();
		String w2 = it.next();
		//String w3 = it.next();
		
		driver.switchTo().window(w2);
		System.out.println(driver.findElement(By.className("example")).getText());
		driver.switchTo().window(w1);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		}

}
