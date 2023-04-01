import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BranchParameter {

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

		// Select sub menu branch Parameter

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[5]/a/span"))
				.click();
		Thread.sleep(2000);

		// select Branch Code *

		WebElement branchcode = driver.findElement(By.id("branchCode"));
		Select bc = new Select(branchcode);
		bc.selectByValue("UNIN0123456");
		Thread.sleep(2000);

		// Default Number Format
		WebElement noformat = driver.findElement(By.id("defaultAmtFormat"));
		Select numberformat = new Select(noformat);
		numberformat.selectByVisibleText("millions");
		Thread.sleep(2000);

		// Default Decimal Separator *
		WebElement decimal = driver.findElement(By.id("decimalSep"));
		Select decimalseparator = new Select(decimal);
		decimalseparator.selectByIndex(1);
		Thread.sleep(2000);

		// Default Default Language *
		WebElement DefaultLanguage = driver.findElement(By.id("deafultLanguage"));
		Select DefaultLan = new Select(DefaultLanguage);
		DefaultLan.selectByIndex(1);
		Thread.sleep(2000);

		// Default Date Format *
		WebElement DateFormat = driver.findElement(By.id("defaultDateFormat"));
		Select DateFor = new Select(DateFormat);
		DateFor.selectByVisibleText("YYYY/MM/DD");
		Thread.sleep(2000);

		// Default Digit Separator *
		WebElement DigitSeparator = driver.findElement(By.id("digitSep"));
		Select separator = new Select(DigitSeparator);
		separator.selectByVisibleText("Comma(,)");
		Thread.sleep(2000);

		// Default Currency *
		WebElement Currency = driver.findElement(By.id("deafultNumberFormat"));
		Select DefaultCurrency = new Select(Currency);
		DefaultCurrency.selectByVisibleText("INR");
		Thread.sleep(2000);

		// click on OK
		driver.findElement(
				By.xpath("/html/body/div[1]/div/section/section/div/div/section/div/div/div/div[15]/div/div[2]/button"))
				.click();
		Thread.sleep(5000);

		// Click on ok>>on success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

	}

}
