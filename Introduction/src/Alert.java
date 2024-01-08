import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// https://rahulshettyacademy.com/AutomationPractice/


		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//int a = 10;

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Ashwini");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("Tap Cancel");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Tapped on cancel");
		driver.close();

	}

}
