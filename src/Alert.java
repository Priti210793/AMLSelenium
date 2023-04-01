import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alert {

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

		/// Select ALert
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[7]/a/span")).click();
		Thread.sleep(2000);

		// 1. screen ==== select Scenario > Simulator
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[7]/div/ul/li[1]/a/span"))
				.click();
		Thread.sleep(2000);

		// select from date
		driver.findElement(By.id("startDate")).sendKeys("01/01/2012");
		Thread.sleep(2000);

		// select TO date
		driver.findElement(By.id("endDate")).sendKeys("03/15/2023");
		Thread.sleep(2000);

		// select Alert Scenario drop down-----not working drop down value not able to
		// select
		WebElement Scenario = driver.findElement(By.id("ruleId"));
		Select AlertScenario = new Select(Scenario);
		AlertScenario.selectByVisibleText("Ready");
		Thread.sleep(2000);

		// *******************************************************************************************
		// Mouse over

		Actions b = new Actions(driver);
		b.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		/// Select ALert
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[7]/a/span")).click();
		Thread.sleep(2000);

		// 2.screen ==== select Alert serach
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[7]/div/ul/li[2]/a/span"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("createdDate")).sendKeys("01/01/2012");
		Thread.sleep(2000);

		driver.findElement(By.id("Save")).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");

		/// Edit //delete not working not able to cliak on buttons
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/section/section/div/div/div/section/div/div/div[2]/section/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/div/i[1]"))
				.click();
		Thread.sleep(2000);
		
		
		
		// 2.screen ==== Rules Exception Mark
		
		driver.findElement(By.id("senarioDescription")).sendKeys("01/01/2012");
		Thread.sleep(2000);
		
		WebElement RulesExceptionMark= driver.findElement(By.id("senarioDescription"));
		Select RulesExceptionMark1 = new Select(RulesExceptionMark);
		RulesExceptionMark1.selectByVisibleText("Ready");
		Thread.sleep(2000);
		
		
		WebElement ExceptionForCustomer= driver.findElement(By.id("exception"));
		Select ExceptionForCustomer1 = new Select(ExceptionForCustomer);
		ExceptionForCustomer1.selectByVisibleText("C00101-Paresh Prakash Khatu");
		Thread.sleep(2000);
		
		driver.findElement(By.id("fromDate")).sendKeys("01/01/2012");
		Thread.sleep(2000);
		
		driver.findElement(By.id("toDate")).sendKeys("01/01/2023");
		Thread.sleep(2000);
		
		driver.findElement(By.id("reasonException")).sendKeys("Rules Exception Mark");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Save")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
