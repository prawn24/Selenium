package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		//click on oneway
		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();

}
}
