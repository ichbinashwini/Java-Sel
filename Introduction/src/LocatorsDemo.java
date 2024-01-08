import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ashwini");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).clear();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("Ashwini@123");
		driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("11111111");   //Parent to child traverse by xpath
		//driver.findElement(By.xpath("//button[@xpath = '1']")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//*[@id="container"]/div[1]/form/div/button[2]
		System.out.println(driver.findElement(By.cssSelector("form p ")).getText()); //Parent to child traverse by CSS
		
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys("As");
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();		
		driver.findElement(By.id("chkboxTwo")).click();	
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
		
		

	}

}
