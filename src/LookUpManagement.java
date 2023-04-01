import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LookUpManagement {

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

		// Select Administrator
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		//select lookup menu
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[4]/a/span")).click();
		
		//select LookUp Type *
		WebElement LookUp = driver.findElement(By.id("lookupCode"));
		Select lookuptype = new Select(LookUp);
		lookuptype.selectByValue("L008");
		Thread.sleep(2000);
		
		//enter lookp code
		driver.findElement(By.id("lookupValueCode")).sendKeys("A001");
		
		driver.findElement(By.id("lookupValue")).sendKeys("QAtest");
		
		driver.findElement(By.id("lookupAlias")).sendKeys("a1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		
		
	



		


	}

}
