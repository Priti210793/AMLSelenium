import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monitoring {

	public static void main(String[] args) throws InterruptedException
	{

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
		
		//select Monitoring
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/ul/li[3]/div/ul/li[5]/a/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("receivedOn")).sendKeys("KArjat");
		Thread.sleep(2000);

		driver.findElement(By.id("merchantName")).sendKeys("Axis");
		Thread.sleep(2000);
		
		driver.findElement(By.id("merchantLocation")).sendKeys("Pune");
		Thread.sleep(2000);

		driver.findElement(By.id("mcc")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.id("acquirerBank")).sendKeys("ICICI");
		Thread.sleep(2000);
		
		driver.findElement(By.id("merchantIdNo")).sendKeys("18569");
		Thread.sleep(2000);

		driver.findElement(By.id("terminalId")).sendKeys("KArjat");
		Thread.sleep(2000);

		driver.findElement(By.id("cppDate")).sendKeys("03-01-2020");
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifiedDate")).sendKeys("03-01-2023");
		Thread.sleep(2000);
		
		driver.findElement(By.id("fraudLocation")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.id("detectionSource")).sendKeys("Khed");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ipAddress")).sendKeys("21.56.23.25");
		Thread.sleep(2000);
		
		//REset
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div/div/div/div[1]/div[1]/div/div[25]/div[1]/button")).click();
		
		//Fill up form again
		
		driver.findElement(By.id("receivedOn")).sendKeys("KArjat");
		Thread.sleep(2000);

		driver.findElement(By.id("merchantName")).sendKeys("Axis");
		Thread.sleep(2000);
		
		driver.findElement(By.id("merchantLocation")).sendKeys("Pune");
		Thread.sleep(2000);

		driver.findElement(By.id("mcc")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.id("acquirerBank")).sendKeys("ICICI");
		Thread.sleep(2000);
		
		driver.findElement(By.id("merchantIdNo")).sendKeys("18569");
		Thread.sleep(2000);

		driver.findElement(By.id("terminalId")).sendKeys("KArjat");
		Thread.sleep(2000);

		driver.findElement(By.id("cppDate")).sendKeys("03-01-2020");
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifiedDate")).sendKeys("03-01-2023");
		Thread.sleep(2000);
		
		driver.findElement(By.id("fraudLocation")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.id("detectionSource")).sendKeys("Khed");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ipAddress")).sendKeys("21.56.23.25");
		Thread.sleep(2000);
		
		//Click on save
		driver.findElement(By.id("Save")).click();
		Thread.sleep(2000);
		

		//click on success pop up
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		
		
		

		
		
		
		
		
	}


}
