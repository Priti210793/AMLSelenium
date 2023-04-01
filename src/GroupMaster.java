import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroupMaster {

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

		// Select Administrator
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);

		// Select sub menu Group master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[8]/a/span"))
				.click();
		Thread.sleep(2000);

		// enter gropname and grop decs
		driver.findElement(By.id("groupName")).sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("groupDescription")).sendKeys("Test team");
		Thread.sleep(2000);

		// Click on reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[4]/div[2]/div[1]/button"))
				.click();

		// Reenter gropname and grop decs
		driver.findElement(By.id("groupName")).sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("groupDescription")).sendKeys("Test team");
		Thread.sleep(2000);
		
		//Click on save
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[4]/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		
		//click on ok- sucess pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		
		//Click on delete action
		
		

		

		
		
		
	}

}
