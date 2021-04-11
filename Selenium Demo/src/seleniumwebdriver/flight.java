package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranit\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    //to open a web site //https://opensource-demo.orangehrmlive.com/
		driver.get("http://demo.guru99.com/test/newtours/");
		//Enter the username and password
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("sunil");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("sunil");
		//click on login button
		driver.findElement(By.name("submit")).click();
		//click on flights
		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		//using link text 
		//driver.findElement(By.linkText('Flights')
		//click on oneway
		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();
		//@name='tripType' and @value='oneway'
		//working with dropdown
		//first step in working with dropdown is to identify an element and store it in a variable
		WebElement DD = driver.findElement(By.name("fromPort"));
		//click on the dropdown 
		Select sel = new Select(DD);
		// if any value is to be selected 
		sel.selectByValue("New York");
		
		//how many values are there in the dropdown
		//used to identify the number of values in dropdown
		List<WebElement> DDvalue = sel.getOptions();
		System.out.println(DDvalue.size());
		for (int i=0;i<DDvalue.size();i++)
		{
			String value = DDvalue.get(i).getText();
			System.out.println(value);
		}
        //to destination
		WebElement DD1 = driver.findElement(By.name("toPort"));
		Select sel1 = new Select(DD1);
		sel1.selectByValue("Frankfurt");
		// to click on continue
		driver.findElement(By.name("findFlights")).click();
		//to close the active browser window
		driver.close();
		
}
}
