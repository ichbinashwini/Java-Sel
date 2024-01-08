import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
// Enter same option in all fields and validate with the text in the alert-------------------------------------//
public class Assignment6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//1. Check the checkbox---------------------------------------------------		
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedOption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
//2.Select dropdown option------------------------------------------------		
		
		  WebElement myOptions = driver.findElement(By.id("dropdown-class-example"));
		  
		  Select staticDropDown = new Select(myOptions);
		  
		  staticDropDown.selectByVisibleText(selectedOption);
//3.Type same in alert example--------------------------------------------
		  
		  driver.findElement(By.id("name")).sendKeys(selectedOption);
		  driver.findElement(By.id("alertbtn")).click();
//4. Read alert text-------------------------------------------------------
		  
		  driver.switchTo().alert(); 
		 String alertText =  driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 
		 System.out.println(alertText);
		  
		  if (alertText.contains(selectedOption)) {
			  System.out.println("Contains");
		  }
		  else System.out.println("Does not contain");
	 

		
	}

}
