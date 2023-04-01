import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HolidayMaster {

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

		// Select sub menu Holiday master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[9]/a/span"))
				.click();
		Thread.sleep(2000);

		// select Branch Code *
		WebElement BranchCode = driver.findElement(By.id("branchCode"));
		Select DefaultBranchCode = new Select(BranchCode);
		DefaultBranchCode.selectByIndex(2);
		Thread.sleep(2000);

		// select holidaydate
		driver.findElement(By.id("holidayDate")).sendKeys("02/17/2023");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayCode")).sendKeys("M123");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayDesc")).sendKeys("Weekend");
		Thread.sleep(2000);

		// Reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[1]/button"))
				.click();
		Thread.sleep(2000);

		// Reenter
		WebElement BranchCode1 = driver.findElement(By.id("branchCode"));
		Select BranchCode2 = new Select(BranchCode1);
		BranchCode2.selectByIndex(2);
		Thread.sleep(2000);

		driver.findElement(By.id("holidayDate")).sendKeys("02/17/2023");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayCode")).sendKeys("M123");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayDesc")).sendKeys("Weekend");
		Thread.sleep(2000);

		// Click on submit
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(5000);

		// pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(5000);

		/// Modification
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[5]/td[5]/div/i"))
				.click();
		Thread.sleep(4000);

		// Modified details
		// driver.findElement(By.id("holidayDate")).clear();
		// Thread.sleep(2000);

		driver.findElement(By.id("holidayDate")).sendKeys("02/17/2023");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayCode")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("holidayCode")).sendKeys("M1235");
		Thread.sleep(2000);

		driver.findElement(By.id("holidayDesc")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("holidayDesc")).sendKeys("Weekend holiday");
		Thread.sleep(2000);

		// Click on OK

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(5000);

		// Click on OK>>success pop

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
	
	}


}
