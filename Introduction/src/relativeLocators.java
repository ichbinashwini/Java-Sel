import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//above
		//Below()
		//toLeftOf()
		//toRightOf()
		
		//syntax-->  driver.findElement(with(By.Tagname("xyz")).above(WebElement).click();
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement btn1 = driver.findElement(By.xpath("//button[text() = 'Practice']"));
		
		System.out.println(driver.findElement(with(By.tagName("button")).toLeftOf(btn1)).getText());
		driver.findElement(with(By.tagName("button")).toLeftOf(btn1)).click();
		driver.close();
		
	}

}
