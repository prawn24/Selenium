package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranit\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    //to open a web site //http://retailm1.upskills.in/
		driver.get("http://retailm1.upskills.in/");
		//to maximize screen 
		driver.manage().window().maximize();
		//dropdown menu for login page
		driver.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']")).click();
		//clicking on registration
		driver.findElement(By.xpath("//*[@href='http://retailm1.upskills.in/account/register']")).click();
		//to fill in the details //First Name
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Pranit");
		//Last Name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Pathak");
		//E-Mail
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("pranit@gmail.com");
		//Telephone
		WebElement phone = driver.findElement(By.name("telephone"));
		phone.sendKeys("565689236");
		//Address 1
		WebElement address = driver.findElement(By.name("address_1"));
		address.sendKeys("Koramangala");
		//City
		WebElement place = driver.findElement(By.name("city"));
		place.sendKeys("Bangalore");
		//Postcode
		WebElement PIN = driver.findElement(By.name("postcode"));
		PIN.sendKeys("560064");
		//Country 
		WebElement DD1 = driver.findElement(By.name("country_id"));
		Select sel1 = new Select(DD1);
		sel1.selectByValue("99");
		//State
		Select dropdown = new Select(driver.findElement(By.name("zone_id")));  
		dropdown.selectByValue("1489");  
		//Password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("pranit234");
		//Confirm Password
		WebElement verify = driver.findElement(By.name("confirm"));
		verify.sendKeys("pranit234");
		//Subscribe to newsletter : Yes
		driver.findElement(By.xpath("//*[@name='newsletter' and @value='1']")).click();
		//Checkbox
		driver.findElement(By.xpath("//*[@name='checkbox' and @value='1']")).click();
		//Continue
		driver.findElement(By.xpath("//*[@type='submit' and @value='Continue']")).click();
			
	}

}
