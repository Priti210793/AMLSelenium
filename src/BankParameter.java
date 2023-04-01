import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class BankParameter {

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

		// Select sub menu bank Parameter
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[2]/a/span\r\n" + "")).click();
		Thread.sleep(2000);

		// Select Default Digit Separator
		WebElement staticDropdown = driver.findElement(By.id("digitSep"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);

		// select Default Number Format *
		WebElement staticDropdown1 = driver.findElement(By.id("defaultAmtFormat"));
		Select dropdown1 = new Select(staticDropdown1);
		dropdown1.selectByIndex(1);
		Thread.sleep(2000);

		// select Default Currency *
		WebElement currency = driver.findElement(By.id("defaultCurrency"));
		Select currencyname = new Select(currency);
		currencyname.selectByIndex(1);
		Thread.sleep(2000);
		
	

		// Enter  Default SWIFT Home Location *
		driver.findElement(By.id("defaultHome")).sendKeys("priti");
		Thread.sleep(2000);

		// Select defaultDateFormat
		WebElement dateFormat = driver.findElement(By.id("defaultDateFormat"));
		Select date = new Select(dateFormat);
		date.selectByIndex(1);
		Thread.sleep(2000);

		// Select decimalSep
		WebElement decimalSep = driver.findElement(By.id("decimalSep"));
		Select decimal = new Select(decimalSep);
		decimal.selectByIndex(1);
		Thread.sleep(2000);
		
		

		// select Default Language *
		WebElement language = driver.findElement(By.id("defaultLanguage"));
		Select languagedefault = new Select(language);
		languagedefault.selectByIndex(1);
		Thread.sleep(2000);

		
		// select New Customer Days
		driver.findElement(By.id("customerDays")).sendKeys("123");
		Thread.sleep(2000);
		
		//Click on OK
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div/div/div/div[17]/div/div[2]/button\r\n"
				+ "")).click();
		
		Thread.sleep(5000);
		
		
		// Click on OK
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		

		
		


	}

}
