package pk1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facultysignuptest {

	WebDriver driver;
	
	public void posinvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://facultyportal-quizapp.herokuapp.com/");
			
			driver.findElement(By.xpath("//*[@class='text-center']")).click();
			
			driver.findElement(By.name("name")).sendKeys("Ravii kumar");
			driver.findElement(By.name("faculty_id")).sendKeys("ravii_kumar");
			
			
			Select dept = new Select(driver.findElement(By.name("department")));
			dept.selectByVisibleText("CSE");
			Select year = new Select(driver.findElement(By.name("year")));
			year.selectByVisibleText("4");
			Select section = new Select(driver.findElement(By.name("section")));
			section.selectByVisibleText("E");
			
			driver.findElement(By.name("course_code")).sendKeys("15CSE402");
			driver.findElement(By.name("password")).sendKeys("raviikumar");
			driver.findElement(By.name("password2")).sendKeys("raviikumar");
			driver.findElement(By.className("submission")).click();
			
			Thread.sleep(6000);
			
//			driver.get("http://nocheatquiz.herokuapp.com");
//			driver.findElement(By.id("username")).sendKeys("cb.en.u4cse17411");
//			driver.findElement(By.id("password")).sendKeys("varun");
//			driver.findElement(By.className("submission")).click();
			List<WebElement> elts = new ArrayList<WebElement>();
			elts = driver.findElements(By.xpath("//form[@name='customerInfoForm']/span"));
			int flag=0;
			for (int i=0;i<elts.size();i++){
				if(elts.get(i).getText().equals("User already registered please login")){
					flag=1;
					System.out.println("Positive Test case failed since it has given alert of 'User already registered please login");
				}
			}
			if(flag==0){
				System.out.println("Positive Test case passed since it has no alert of 'User already registered please login");
			}
			driver.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void neginvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://facultyportal-quizapp.herokuapp.com/");
			
			driver.findElement(By.xpath("//*[@class='text-center']")).click();
			
			driver.findElement(By.name("name")).sendKeys("Ganesh iyer");
			driver.findElement(By.name("faculty_id")).sendKeys("ganesh_iyer");
			
			Select dept = new Select(driver.findElement(By.name("department")));
			dept.selectByVisibleText("CSE");
			Select year = new Select(driver.findElement(By.name("year")));
			year.selectByVisibleText("4");
			Select section = new Select(driver.findElement(By.name("section")));
			section.selectByVisibleText("E");
			
			driver.findElement(By.name("course_code")).sendKeys("15CSE402");
			driver.findElement(By.name("password")).sendKeys("ganeshsir");
			driver.findElement(By.name("password2")).sendKeys("ganeshsir");
			driver.findElement(By.className("submission")).click();
			
			Thread.sleep(6000);
			
			List<WebElement> elts = new ArrayList<WebElement>();
			elts = driver.findElements(By.xpath("//form[@name='customerInfoForm']/span"));
			int flag=0;
			for (int i=0;i<elts.size();i++){
				if(elts.get(i).getText().equals("User already registered please login")){
					flag=1;
					System.out.println("Negative Test case passed since it has given alert of 'User already registered please login");
					break;
				}
			}
			if(flag==0){
				System.out.println("Negative Test case failed since it has no alert of 'User already registered please login");
			}
			driver.close();
			
//			Thread.sleep(5000);
//			
//			driver.get("http://nocheatquiz.herokuapp.com");
//			driver.findElement(By.id("username")).sendKeys("cb.en.u4cse17411");
//			driver.findElement(By.id("password")).sendKeys("varun");
//			driver.findElement(By.className("submission")).click();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		facultysignuptest obj = new facultysignuptest();
		obj.posinvoke();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.neginvoke();
		
	}

}
