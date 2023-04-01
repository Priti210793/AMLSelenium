import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BranchManagement {

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

		// Select sub menu BranchMAnagement
		driver.findElement(By.xpath("//span[normalize-space()='Branch Management']")).click();
		Thread.sleep(2000);

		// Click on Crate New
		driver.findElement(By.id("Save")).click();

		// Enter Branch code
		driver.findElement(By.id("branchCode")).sendKeys("Axis101");
		Thread.sleep(2000);

		// Enter Branch NAme
		driver.findElement(By.id("branchName")).sendKeys("Axis");
		Thread.sleep(3000);

		// Select Country
		WebElement country = driver.findElement(By.id("branchCountry"));
		Select countryname = new Select(country);
		countryname.selectByVisibleText("India");
		// dropdown.selectByValue("India");
		Thread.sleep(2000);

		// Select City
		WebElement city = driver.findElement(By.id("branchCity"));
		Select name = new Select(city);
		name.selectByValue("Pune");
		Thread.sleep(2000);

		// Enter Branch Manager Name
		driver.findElement(By.id("branchManager")).sendKeys("Mr Deshmkh");
		Thread.sleep(2000);

		// Enter Mob no
		driver.findElement(By.id("mobile")).sendKeys("9865234578");
		Thread.sleep(2000);

		// Enter fax no
		driver.findElement(By.id("fax")).sendKeys("B452562A");
		Thread.sleep(2000);

		// Select branchType
		WebElement branchType = driver.findElement(By.id("branchType"));
		Select branch = new Select(branchType);
		branch.selectByValue("head_office");
		Thread.sleep(2000);

		// Enter Branch Address
		driver.findElement(By.id("branchAddress")).sendKeys("Katraj Pune");

		// select state
		WebElement state = driver.findElement(By.id("branchState"));
		Select statename = new Select(state);
		statename.selectByValue("Maharashtra");
		Thread.sleep(2000);

		// Enter Pin code
		driver.findElement(By.id("postalCode")).sendKeys("421503");
		Thread.sleep(2000);

		// Enter Landline no
		driver.findElement(By.id("tele1")).sendKeys("9865325698");
		Thread.sleep(2000);

		// Enter Email
		driver.findElement(By.id("emailId")).sendKeys("p@gmail.com");

		// Click on save

		driver.findElement(
				By.xpath("//*[@id=\"main-content\"]/section/div/div/section/div/div[6]/div/div[29]/div[2]/div/button"))
				.click();
		Thread.sleep(5000);

		//success message
		System.out.println(driver.findElement(By.id("swal2-content")).getText());
		Thread.sleep(2000);

		// Click on OK
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		// Mouse over

		Actions s = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(2000);

		// Select Administrator
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		

		// select LookUp Management
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[4]/a/span\r\n" + "")).click();
		Thread.sleep(2000);

	}

}
