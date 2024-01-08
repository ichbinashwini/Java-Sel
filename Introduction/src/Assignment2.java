import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@minlength= '2']")).sendKeys("ASHWINI"); // Enter name
		driver.findElement(By.cssSelector("input[name= 'email']")).sendKeys("ashley@gmail.com");  // Enter email
		driver.findElement(By.cssSelector("input[id = 'exampleInputPassword1']")).sendKeys("12345"); //Enter password
		driver.findElement(By.id("exampleCheck1")).click(); //Check the check box
		
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));  //Select Gender as female
		Select staticDropDown = new Select (genderDropdown); 
		staticDropDown.selectByIndex(1);
		System.out.println(staticDropDown.getFirstSelectedOption().getText());
		Assert.assertEquals(staticDropDown.getFirstSelectedOption().getText(), "Female");
		
		driver.findElement(By.id("inlineRadio1")).click();  // check box as Student
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("29/22/1996"); //Enter Birthdate
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		driver.close();		
		
		
		
		
		
		
		
		
		
		
		

	}

}
