import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Banned_Merchant_Master {

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

		// Select Master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);

		// select Banned merchat master

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[4]/a/span"))
				.click();
		Thread.sleep(2000);

		// select Merchant Code *
		WebElement Merchant = driver.findElement(By.id("merchantscode"));
		Select MerchantCode = new Select(Merchant);
		MerchantCode.selectByVisibleText("M0002");
		Thread.sleep(2000);

		driver.findElement(By.id("merhantname")).sendKeys("Merchant123");

		WebElement status = driver.findElement(By.id("status"));
		Select statusname = new Select(status);
		statusname.selectByVisibleText("Banned");
		Thread.sleep(2000);

		driver.findElement(By.id("banreason")).sendKeys("illegal");
		Thread.sleep(2000);

		// not working===save button
		driver.findElement(By.xpath("//*[@id=\"Save\"]")).click();
		Thread.sleep(2000);

		// Edit action
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[3]/td[5]/div/i[1]"))
				.click();
		Thread.sleep(2000);

		WebElement EditMerchant = driver.findElement(By.id("merchantscode"));
		Select EditMerchantCode = new Select(EditMerchant);
		EditMerchantCode.selectByVisibleText("M0002");
		Thread.sleep(2000);

		
		driver.findElement(By.id("merhantname")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("merhantname")).sendKeys("Merchant123");
		Thread.sleep(2000);

		WebElement Editstatus = driver.findElement(By.id("status"));
		Select Editstatusname = new Select(Editstatus);
		Editstatusname.selectByVisibleText("Banned");
		Thread.sleep(2000);

		driver.findElement(By.id("banreason")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("banreason")).sendKeys("illegal");
		Thread.sleep(2000);

		// click on update
		driver.findElement(By.id("Save")).click();
		Thread.sleep(2000);

        //click on ok>>success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		
		
	}

}
