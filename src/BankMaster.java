import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankMaster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\F_drive_data\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
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
		Thread.sleep(5000);
		
		//Mouse over
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item drop1']"))).build().perform();
		Thread.sleep(3000);
		
		//Select Administrator
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		
		//Select sub menu bank master 

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		
		//Enter  details on BAnk master form
		
		driver.findElement(By.id("bank_address")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("bank_address")).sendKeys("Katraj");
		Thread.sleep(3000);
		driver.findElement(By.id("bank_name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("bank_name")).sendKeys("Axis");
		Thread.sleep(3000);
	   driver.findElement(By.id("bank_contactNo")).clear();
	   
		Thread.sleep(3000);
		driver.findElement(By.id("bank_contactNo")).sendKeys("9865321478");
		Thread.sleep(3000);
		
		driver.findElement(By.id("fileList")).sendKeys("C:\\F_drive_data\\AML\\Image\\download.jpg"); //Browse button
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div/div/section/div/div/div/div[13]/div[1]/div[3]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);


		

	}

}
