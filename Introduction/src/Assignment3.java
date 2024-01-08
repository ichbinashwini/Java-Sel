import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait expliWait = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");  //Username
		driver.findElement(By.id("password")).sendKeys("learning");     //Password
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click(); //User as a type
		Thread.sleep(5000);
		expliWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dropDownOptions = driver.findElement(By.xpath("//select[@class='form-control']")); // Select from static dropdown
		 
		Select staticDropdown1 = new Select(dropDownOptions);
		staticDropdown1.selectByValue("stud");
		
		
		driver.findElement(By.id("terms")).click();  //click on terms
		driver.findElement(By.id("signInBtn")).click();  //Click on Signin
		
		expliWait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List <WebElement> allProducts = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for(int i=0 ; i < allProducts.size(); i++) {
			
			allProducts.get(i).click();
			
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		System.out.println("Checked out and browser closed");
		driver.close();
		
		
	
		
	}

}
