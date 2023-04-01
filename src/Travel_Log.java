import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Travel_Log {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\F_drive_data\\chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://bot.nellinfotech.com:8021/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("bankCode")).sendKeys("A1005");
		Thread.sleep(2000);
		driver.findElement(By.id("userId")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();
		Thread.sleep(3000);

		// Mouse over

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// Select Master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		
		//select Travel log
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("fromdate")).sendKeys("01/01/2012");
		
		
		driver.findElement(By.id("todate")).sendKeys("02/23/2023");

		

		WebElement Country = driver.findElement(By.id("country"));
		Select countryname = new Select(Country);
		countryname.selectByVisibleText("London");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[7]/div/button")).click();
		

		
		

		
		

		
		
	}

}
