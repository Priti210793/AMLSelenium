import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Analysis {

	public static void main(String[] args) throws InterruptedException {

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

		// click on Dashbboard

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);

		// click on Analysis

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[1]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(3000);

		// click on Alert-Monitor

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/h5/a")).click();
		Thread.sleep(3000);

		// select Alert Category *
		WebElement AlertCategory = driver.findElement(By.id("category"));
		Select AlertCategory1 = new Select(AlertCategory);
		AlertCategory1.selectByVisibleText("SDN");
		Thread.sleep(2000);

		// click on serach
		driver.findElement(
				By.xpath("/html/body/div[1]/div/section/section/div/section/div/div/div[1]/div/div[3]/div/button"))
				.click();
		Thread.sleep(3000);

		// select 1 Quarter tab

		driver.findElement(By.xpath("//*[@id=\"react-tabs-4\"]")).click();
		Thread.sleep(3000);

		// Mouse over

		Actions B = new Actions(driver);
		B.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// click on Dashbboard

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);

		// click on Analysis

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(3000);

		// cLICK ON ALERT statices
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/h5/a")).click();
		Thread.sleep(3000);

		// select 1 year tab

		driver.findElement(By.xpath("//*[@id=\"react-tabs-8\"]")).click();
		Thread.sleep(5000);

		// click on Dashbboard

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		

		
		// click on Analysis

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[3]/div/h5/a")).click();
		Thread.sleep(3000);

		// select 6 Month tab

		driver.findElement(By.xpath("//*[@id=\"react-tabs-6\"]")).click();
		Thread.sleep(3000);

		// click on Dashbboard

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);

		// click on 

	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[1]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(3000);
		
		//select Branch Risk Monitor

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/h5/a")).click();
		Thread.sleep(3000);
		
		
		
		
		
		

	}

}
