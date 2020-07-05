package pk1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signintest {
	
	WebDriver driver;
	
	public void posinvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://nocheatquiz.herokuapp.com");
			
			
			driver.findElement(By.id("username")).sendKeys("cb.en.u4cse17402");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.className("submission")).click();
			
			Thread.sleep(3000);
			
			List<WebElement> elts = new ArrayList<WebElement>();
			elts = driver.findElements(By.xpath("//div[@class='d-flex flex-column']/span"));
			int flag=0;
			for (int i=0;i<elts.size();i++){
				if(elts.get(i).getText()=="Username not found, please Signup" || elts.get(i).getText()=="Invalid password"){
					flag=1;
					System.out.println("Positive Test case failed since it has given alerts regarding invalid credentials");
				}
			}
			if(flag==0){
				System.out.println("Positive Test case passed since it has no alerts regarding invalid credentials");
			}
			
			driver.close();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void negunameinvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://nocheatquiz.herokuapp.com/home");
			
			driver.findElement(By.id("username")).sendKeys("cb.en.u4cse17439");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.className("submission")).click();
			
			Thread.sleep(6000);
			
			List<WebElement> elts = new ArrayList<WebElement>();
			elts = driver.findElements(By.xpath("//div[@class='d-flex flex-column']/span"));
			int flag=0;
			for (int i=0;i<elts.size();i++){
				if(elts.get(i).getText().equals("Username not found, please Signup")){
					flag=1;
					System.out.println("Negative Test case passed since it has given alert of 'Username not found, please Signup' ");
					break;
				}
			}
			if(flag==0){
				System.out.println("Negative Test case failed since it has no alert of 'Username not found, please Signup' ");
			}
			
			driver.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void negpswdinvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://nocheatquiz.herokuapp.com/home");
			
			driver.findElement(By.id("username")).sendKeys("cb.en.u4cse17402");
			driver.findElement(By.id("password")).sendKeys("sush");
			driver.findElement(By.className("submission")).click();
			
			Thread.sleep(6000);
			
			List<WebElement> elts = new ArrayList<WebElement>();
			elts = driver.findElements(By.xpath("//div[@class='d-flex flex-column']/span"));
			int flag=0;
			for (int i=0;i<elts.size();i++){
				if(elts.get(i).getText().equals("Invalid password")){
					flag=1;
					System.out.println("Negative Test case passed since it has given alert of 'Invalid password' ");
					break;
				}
			}
			if(flag==0){
				System.out.println("Negative Test case failed since it has no alert of 'Invalid password' ");
			}
			
			driver.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		signintest obj = new signintest();
		obj.posinvoke();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.negunameinvoke();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.negpswdinvoke();
		
	}

}