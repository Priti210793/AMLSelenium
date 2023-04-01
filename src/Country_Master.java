import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Country_Master {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		// Select System module
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/a/span")).click();
		Thread.sleep(2000);

		// select Country master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("countryCode")).sendKeys("USA");
		Thread.sleep(2000);

		driver.findElement(By.id("countryName")).sendKeys("United States");
		Thread.sleep(2000);

		// reset
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[4]/div[2]/div[1]/button"))
				.click();
		Thread.sleep(2000);

		// enter details

		driver.findElement(By.id("countryCode")).sendKeys("USA");
		Thread.sleep(2000);

		driver.findElement(By.id("countryName")).sendKeys("United States");
		Thread.sleep(2000);

		// click on submit
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[4]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

		// Modification
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/div/i[1]"))
				.click();

		// clear data and re enter details
		driver.findElement(By.id("countryCode")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("countryCode")).sendKeys("AUS");
		Thread.sleep(2000);

		driver.findElement(By.id("countryName")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("countryName")).sendKeys("Australia");
		Thread.sleep(2000);

		// Click on submit
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[4]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(5000);

		// click on sucess pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		

		///********************************************************************

		// select next screen
		// Mouse over
		Actions b = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// Select System
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/a/span")).click();
		Thread.sleep(2000);

		// Selet State master
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[6]/div/ul/li[2]/a/span"))
				.click();
		Thread.sleep(2000);

		// select State Code *
		driver.findElement(By.id("stateCode")).sendKeys("DL");
		Thread.sleep(2000);

		/// State Name *
		driver.findElement(By.id("stateName")).sendKeys("Delhi");
		Thread.sleep(2000);

		// Country Name *

		WebElement Country = driver.findElement(By.id("countryCode"));
		Select Countryname = new Select(Country);
		Countryname.selectByVisibleText("India");
		Thread.sleep(2000);

		// CLick on save
		driver.findElement(By
				.xpath("/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[7]/div/div[2]/button"))
				.click();
		Thread.sleep(3000);

		// click on success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		

		///********************************************************************

		// select next screen
		// Mouse over
		Actions c = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// Select System
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/a/span")).click();
		Thread.sleep(2000);

		// select city master
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/div/ul/li[3]/a/span"))
				.click();
		Thread.sleep(2000);

		// select City Code *
		driver.findElement(By.id("cityCode")).sendKeys("NA");
		Thread.sleep(2000);

		// select City Name *
		driver.findElement(By.id("cityName")).sendKeys("Nagar");
		Thread.sleep(2000);

		// State Code *
		WebElement State = driver.findElement(By.id("stateCode"));
		Select StateCode = new Select(State);
		StateCode.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);

		// Country Name *

		WebElement CountryName = driver.findElement(By.id("countryCode"));
		Select countryCode = new Select(CountryName);
		countryCode.selectByVisibleText("India");
		Thread.sleep(2000);

		// click on sumit
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(3000);

		// click on ok pop p
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		/// delete

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[5]/td[5]/div/i[2]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(3000);

		// modification
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[4]/td[5]/div/i[1]"))
				.click();
		Thread.sleep(2000);

		// select City Code *
		driver.findElement(By.id("cityCode")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("cityCode")).sendKeys("KP");
		Thread.sleep(2000);

		// select City Name *
		driver.findElement(By.id("cityName")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("cityName")).sendKeys("Kohlapur");
		Thread.sleep(2000);

		// after click on update button getting error.
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[8]/div[2]/div[2]/button"))
				.click();
		Thread.sleep(2000);

		///********************************************************************
		// select next screen
		// Mouse over
		Actions d = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// Select System
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/a/span")).click();
		Thread.sleep(2000);

		// select cureency master 

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[6]/div/ul/li[4]/a/span"))
				.click();
		Thread.sleep(2000);

		// Currency Code *
		driver.findElement(By.id("currencyCode")).sendKeys("abc");
		Thread.sleep(2000);

		// Currency Name
		driver.findElement(By.id("currencyName")).sendKeys("a");
		Thread.sleep(2000);

		// Major Unit
		driver.findElement(By.id("majorUnit")).sendKeys("12");
		Thread.sleep(2000);

		// Minor Unit
		driver.findElement(By.id("minorUnit")).sendKeys("12");
		Thread.sleep(2000);

		// Major/Minor * Conversion Factor
		driver.findElement(By.id("conversionFactor")).sendKeys("1");
		Thread.sleep(2000);

		// Decimal Unit
		driver.findElement(By.id("decimalUnit")).sendKeys("1");
		Thread.sleep(2000);

		// click on submit
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[1]/div/div/div[13]/div/div[2]/button"))
				.click();
		Thread.sleep(2000);

		// click on pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
