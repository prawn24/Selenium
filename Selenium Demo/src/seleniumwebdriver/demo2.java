package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranit\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    //to open a web site //https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//to maximize screen 
		driver.manage().window().maximize();
		//to enter username and password //username in a variable
		WebElement username = driver.findElement(By.id("txtUsername"));
		//if element is enabled then I will enter the name
		if(username.isEnabled())
		{
			//to clear the value of the element present if any
			username.clear();
			username.sendKeys("Admin");
		}
            if(username.isDisplayed())
            {
            	//enter password and click on login button
            	WebElement pwd = driver.findElement(By.id("txtPassword"));
            	pwd.clear();
            	pwd.sendKeys("admin123");
            	driver.findElement(By.id("btnLogin")).click();
            	Thread.sleep(3000);
            	//find total number of links
            	List<WebElement> link = driver.findElements(By.tagName("a"));
            	//how many links are there 
            	System.out.println(link.size());
            	//print the names of the link present in the web page
            	for(int i=0;i<link.size();i++)
            	{
            		System.out.println(link.get(i).getText());
            	}
            }
            else
            	{
            		System.out.println("Not displayed");
            	}
            }
	}


