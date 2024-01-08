import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//---------Static Drop down---------------

		/*
		WebElement selectDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select staticDropDown = new Select(selectDropDown);
		staticDropDown.selectByIndex(2);

		System.out.println(staticDropDown.getFirstSelectedOption().getText());
		*/
		

//-------Dropdown With +/- items-------------------------------
		
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.id("divpaxinfo")).click();
		  
		  Thread.sleep(1000); 
		  for (int i=1; i<4; i++)
			  {
			  driver.findElement(By.id("hrefIncAdt")).click();
			  
			  }
			  
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  //ctl00_mainContent_ddl_originStation1_CTXTaction
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

		// From Departure city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='PAT']")).click();

		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='AMD']")).click();

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");

// ----------------------Auto suggestive drop down------------------------------------
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		// List<WebElement> options = driver.findElements(By.cssSelector("ui-id-1"));

		for (WebElement option : options) {
			System.out.println(option);
			Thread.sleep(2000);
			if (option.getText().equalsIgnoreCase("India")) {

				option.click();
				Thread.sleep(2000);

				break;

			}
			System.out.println(option);
		}
		System.out.println(driver.findElement(By.id("autosuggest")).getText());
		// getFirstSelectedOption().getText()

//-----------------Check box-------------------------------------------------

		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());

		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

		driver.close();
		System.out.println("Ran and closed");

	}

}
