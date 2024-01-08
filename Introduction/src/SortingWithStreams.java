import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingWithStreams {

	public static void main(String[] args) throws InterruptedException {
		//TODO Verify that the list is sorted (Lecture 117)
		
		//---Action plan---
		// Click on the column which will give the sorted list
		// Get all the web elements
		// Get the text associated with each web element (Actual list)
		// Sort the same list using "Sorted" method (Expected list)
		// Compare both the lists using Assert.
		
		//Going forward- Executes the pagination
		

		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[text() = 'Top Deals']")).click();
		
		//String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		
		String parent_window = I1.next();
		String child_window = I1.next();
		
		driver.switchTo().window(child_window);
		Thread.sleep(5000);
		
		
		//System.out.println(driver.getTitle());
	
		
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[text() = 'Veg/fruit name']")).click();
		List <String> Price;
		
		
			
	    
	    do 
	    {
	    	List<WebElement> all_veggies = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			
			
			List <String> sortedListFromWb = all_veggies.stream().map(each->each.getText()).collect(Collectors.toList());
			System.out.println(sortedListFromWb);
	    	
			List <String>sortedByAuto = sortedListFromWb.stream().sorted().collect(Collectors.toList());
			//System.out.println(sortedByAuto);
			
			Assert.assertTrue(sortedListFromWb.equals(sortedByAuto));
			
		    Price = all_veggies.stream().filter(r->r.getText().contains("Potato")).
		    		map(p->getPrice(p)).collect(Collectors.toList());
		    
		    if (Price.size()<1)
		    {
		    	driver.findElement(By.xpath("(//a[@role = 'button'])[7]")).click();
		    	
		    }
	    	
	    }
	    while(Price.size()<1);
	    
		Price.forEach(a->System.out.println(a));
		
		driver.quit();
		
		
		
		
	}
	
	public static String getPrice(WebElement r)
	{
		
		String priceValue =	r.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}

}
