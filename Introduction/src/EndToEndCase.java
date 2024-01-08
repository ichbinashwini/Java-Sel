import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndCase {

	public static void main(String[] args) throws InterruptedException {
		//Using CHROME DRIVER-------------------------
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Using EDGE DRIVER-----------------------------
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		String name = "Ashwini";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		EndToEndCase fromMethod = new EndToEndCase();
		String password= fromMethod.getPassword(driver);
		//String password= getPassword(driver);
		driver.findElement(By.xpath("//*[@class= 'go-to-login-btn']")).click();
		driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys(password);
		//driver.findElement(By.id("chkboxOne")).click();		
		//driver.findElement(By.id("chkboxTwo")).click();	
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+ name + ",");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		System.out.println("User successfully logged out and browser is closed");
		driver.close();

	}
	
	
	public String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		String passwordArray = driver.findElement(By.tagName("p")).getText();
		String[] splittedArray= passwordArray.split("'");
		//System.out.println(splittedArray);
		String[] splittedArray2 = splittedArray[1].split("'");
		//System.out.println(splittedArray2[0]);
		return splittedArray2[0];
		
		
		
	}

}
