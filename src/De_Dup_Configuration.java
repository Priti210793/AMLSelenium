import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class De_Dup_Configuration {

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

		// select DE_DUP_Config
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[7]/a/span"))
				.click();
		Thread.sleep(2000);

		// select Entity
		WebElement Entity = driver.findElement(By.id("custEntity"));
		Select customerentity = new Select(Entity);
		customerentity.selectByVisibleText("Customer");
		Thread.sleep(2000);

		// select Field
		WebElement Field = driver.findElement(By.id("custField"));
		Select Fieldname = new Select(Field);
		Fieldname.selectByVisibleText("Customer Name");
		Thread.sleep(2000);

		// click on save
		driver.findElement(By.id("Reset")).click();
		Thread.sleep(2000);

		// success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		// delete

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[8]/td[3]/div/i[2]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);

		// modification

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/section/div/div/section/div[2]/div/div/div/div/div[1]/div[2]/table/tbody/tr[8]/td[3]/div/i[1]"))
				.click();
		Thread.sleep(2000);

		// select address filed at the time of modification

		WebElement Fieldadd = driver.findElement(By.id("custField"));
		Select Fieldnameadd = new Select(Fieldadd);
		Fieldnameadd.selectByVisibleText("Address");
		Thread.sleep(2000);

		// click on save
		driver.findElement(By.id("Reset")).click();
		Thread.sleep(2000);

		// success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
