import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Banned_Material_Master {

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
		Thread.sleep(5000);

		// Mouse over

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(3000);

		// SelectMAster module
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);

		// select Banned matrial master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[2]/a/span"))
				.click();
		Thread.sleep(2000);

		// Enter Banned materialcode
		driver.findElement(By.id("materialcode")).sendKeys("BMC123");
		Thread.sleep(2000);

		// materialname
		driver.findElement(By.id("materialname")).sendKeys("oil");
		Thread.sleep(2000);

		// select fromdate and tilldate
		// if select past date
		//driver.findElement(By.id("fromdate")).sendKeys("02/23/2023");
		//Thread.sleep(2000);

		// error message
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		//Thread.sleep(2000);


		// select fromdate and tilldate

		driver.findElement(By.xpath("//*[@id=\"fromdate\"]")).sendKeys("02/24/2023");
		Thread.sleep(2000);

		driver.findElement(By.id("tilldate")).sendKeys("02/28/2023");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Save")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		
		//Delete action
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[6]/td[5]/div/i[2]")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		
		
		
		

		
		
		
	}

}
