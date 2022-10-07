package anc;

import java.awt.AWTException;
import java.awt.Robot;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C://Users//nitfv//Desktop//Working_Area//Selenium//Drivers//chromedriver_win32//chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C://Users//nitfv//Desktop//Working_Area//Selenium//Drivers//IEDriverServer_x64_4.5.0//IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver","C://Users//nitfv//Desktop//Working_Area//Selenium//Drivers//geckodriver-v0.31.0-win64//geckodriver.exe");
		System.setProperty("webdriver.edge.driver","C://Users//nitfv//Desktop//Working_Area//Selenium//Drivers//edgedriver_win64//msedgedriver.exe");
		System.out.println("Hello World ");
	
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		//driver.setCapability("marionette", true);
		
		
		driver.get("https://www.facebook.com/");
		System.out.println("The tile of the page is "+driver.getTitle());
		Thread.sleep(100);
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("nitfver@gmail.com");

	    WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("nv405279");
		Thread.sleep(100);
		
		
		driver.findElement(By.name("login")).click();
		//Thread.sleep(5000);
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'][contains(.,'Nitin Verma')]")).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g")).click();
		
		Thread.sleep(3000); 
		 
				
		System.out.println("WE ARE LOGGED in into the system !!! and now we are HERE IT IS");
		//driver.close();
		
	}

}
