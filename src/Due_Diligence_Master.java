import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Due_Diligence_Master {

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
		
		//select Due Diligence master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		
		//selet enity and filed 
		WebElement enity = driver.findElement(By.id("entityCode"));
		Select enityname = new Select(enity);
		enityname.selectByVisibleText("Account");
		Thread.sleep(2000);
		
		WebElement Field = driver.findElement(By.id("fieldname"));
		Select Fieldname = new Select(Field);
		Fieldname.selectByVisibleText("Account Number");
		Thread.sleep(2000);
		
	//	click on save  --not working
		
		driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
		

		

	}

}
