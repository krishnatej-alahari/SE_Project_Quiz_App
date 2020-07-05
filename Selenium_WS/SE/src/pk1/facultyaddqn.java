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

public class facultyaddqn {

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
			
			driver.findElement(By.id("username")).sendKeys("priyanka_kumar");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.className("submission")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@href='/addQuestions']")).click();
			
			Thread.sleep(2000);
			
			Select class1 = new Select(driver.findElement(By.name("course_code")));
			class1.selectByVisibleText("15CSE402");
			Thread.sleep(2000);
			Select class2 = new Select(driver.findElement(By.name("coo_tag")));
			class2.selectByVisibleText("1");
			Thread.sleep(2000);
			driver.findElement(By.name("topic")).sendKeys("Introduction");
			Thread.sleep(2000);
			driver.findElement(By.name("question")).sendKeys("Which of the following term describes testing?");
			Thread.sleep(2000);
			driver.findElement(By.name("answer")).sendKeys("Evaluating deliverable to find errors");
			Thread.sleep(2000);
			driver.findElement(By.id("0")).sendKeys("Finding broken code");
			driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("1")).sendKeys("Evaluating deliverable to find errors");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("2")).sendKeys("A stage of all projects");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("3")).sendKeys("None of the mentioned");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='submit' ]")).click();
			Thread.sleep(2000);
			
			try 
			{ 
				driver.switchTo().alert(); 
				String s=driver.switchTo().alert().getText();
				if(s.equals("Question added, you can submit another or leave")){
					System.out.println("Positive Test case passed since it has given alerts regarding questions are added");
				}
				else{
					System.out.println("Positive Test case failed since it has no alerts regarding questions are added");
				}
				driver.switchTo().alert().accept();
				
			}   // try 
			catch (NoAlertPresentException Ex) 
			{ 
				
			} 
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
public void negnooptioninvoke(){
		
		try {
			System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://facultyportal-quizapp.herokuapp.com/");
			
			driver.findElement(By.id("username")).sendKeys("priyanka_kumar");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.className("submission")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@href='/addQuestions']")).click();
			
			Thread.sleep(2000);
			
			Select class1 = new Select(driver.findElement(By.name("course_code")));
			class1.selectByVisibleText("15CSE402");
			Thread.sleep(2000);
			Select class2 = new Select(driver.findElement(By.name("coo_tag")));
			class2.selectByVisibleText("1");
			Thread.sleep(2000);
			driver.findElement(By.name("topic")).sendKeys("Introduction");
			Thread.sleep(2000);
			driver.findElement(By.name("question")).sendKeys("Maintenance testing is performed using which methodology....");
			Thread.sleep(2000);
			driver.findElement(By.name("answer")).sendKeys("Evaluating deliverable to find errors");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='submit' ]")).click();
			Thread.sleep(2000);
			
			try 
			{ 
				driver.switchTo().alert(); 
				String s=driver.switchTo().alert().getText();
				if(s.equals("Please check the fields")){
					System.out.println("Negative Test case passed since it has given alerts regarding checking the fields");
				}
				else{
					System.out.println("Negative Test case failed since it has no alerts regarding checking the fields");
				}
				driver.switchTo().alert().accept();
				
			}   // try 
			catch (NoAlertPresentException Ex) 
			{ 
				
			} 
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

public void negnocorrectinvoke(){
	
	try {
		System.setProperty("webdriver.chrome.driver","F:\\6th SEM\\SE\\Selenium WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://facultyportal-quizapp.herokuapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("priyanka_kumar");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.className("submission")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@href='/addQuestions']")).click();
		
		Thread.sleep(2000);
		Select class1 = new Select(driver.findElement(By.name("course_code")));
		class1.selectByVisibleText("15CSE402");
		Thread.sleep(2000);
		Select class2 = new Select(driver.findElement(By.name("coo_tag")));
		class2.selectByVisibleText("1");
		Thread.sleep(2000);
		driver.findElement(By.name("topic")).sendKeys("Introduction");
		Thread.sleep(2000);
		driver.findElement(By.name("question")).sendKeys("Maintenance testing is performed using which methodo");
		Thread.sleep(2000);
		driver.findElement(By.id("0")).sendKeys("Finding broken code");
		driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("1")).sendKeys("Evaluating deliverable to find errors");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("2")).sendKeys("A stage of all projects");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@style='border-color: black; cursor: pointer;' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("3")).sendKeys("None of the mentioned");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit' ]")).click();
		Thread.sleep(2000);
		
		try 
		{ 
			driver.switchTo().alert(); 
			String s=driver.switchTo().alert().getText();
			if(s.equals("Please check the fields")){
				System.out.println("Negative Test case passed since it has given alerts regarding checking the fields");
			}
			else{
				System.out.println("Negative Test case failed since it has no alerts regarding checking the fields");
			}
			driver.switchTo().alert().accept();
			
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			
		} 
		
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		facultyaddqn obj = new facultyaddqn();
		obj.posinvoke();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.negnooptioninvoke();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.negnocorrectinvoke();
	}

}