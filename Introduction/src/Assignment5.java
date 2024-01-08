import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

			
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Nested Frames")).click();
		

			driver.switchTo().frame("frame-top");



			driver.switchTo().frame("frame-middle");



			System.out.println(driver.findElement(By.id("content")).getText());


			
		
	}

}
