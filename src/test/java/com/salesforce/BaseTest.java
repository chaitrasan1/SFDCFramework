package com.salesforce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;
import com.firebase.utilities.ExtentReportsUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.firebase.utilities.FirebaseListenerutility.class)
public class BaseTest {
	protected WebDriver driver = null;
	protected Wait<WebDriver> wait = null;
	protected Logger baseTestlog = LogManager.getLogger();
	protected ExtentReportsUtility  extentReport = ExtentReportsUtility.getInstance();

	public void launchBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			baseTestlog.info("browser instance chrome created");
			
			driver.manage().window().maximize();
			baseTestlog.info("window is maximized");
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			driver.manage().window().maximize();
			break;

		case "safari":
			// Safari does not require a separate driver setup, as it is included with macOS
			driver = new SafariDriver();
			break;

		default:
			baseTestlog.info("Unsupported browser: " + browserName);
		}

		// return driver;
	}
	
	public void goToUrl(String url) {
		System.out.println("Inside go to URL:"+ url );
		driver.get("https://qa-tekarch.firebaseapp.com/");
		baseTestlog.info(url + "is entered");
		
	}

	public void enterText(WebElement ele, String data, String objectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			baseTestlog.info("username data is entered in " + objectName + " textbox");
		} else {
			baseTestlog.info(objectName + " element is not displayed");
		}
	}
	
	public void clickElement(WebElement ele, String objectName) {
		if (ele.isEnabled()) {
			ele.click();
			baseTestlog.info(objectName + "button is clicked");
			
		} else {
			baseTestlog.info(objectName+" element is not enabled");
			
		}
	}
	
	public String getTextFromElement(WebElement ele, String objectName) {
		String data = ele.getText();
		baseTestlog.info("text is extracted from "+objectName);
		return data;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		baseTestlog.info("Get tiltle ");
		return title;
		
	}
	
	public void closeBrowser() {
		driver.close();
		baseTestlog.info("browser instance closed");
		driver=null;
	}
public Alert switchToAlert() {
Alert a = driver.switchTo().alert();
baseTestlog.info("Switched to alert");
return a;
		
	}

	public void AcceptAlert(Alert alert) {

		baseTestlog.info("Alert accepted");
		alert.accept();

	}

	public String getAlertText(Alert alert, String objectname) {
		String str= alert.getText();
		return str;

	}

	public void dismisAlert() {

		

	}
	// ******************************alert ends**************************************

		// ******************************Action class reusable methods**************************************
		

		public void mouseOverOnElement(WebElement ele, String objName) {
			
		}

		public void ContextClickOnElement(WebElement ele, String objName) {
			
		}

		// ******************************Action class reusable method ends**************************************

		// ******************************Select class reusable method starts*************************************

		public void selectByTextData(WebElement element, String text, String objName) {
			

		}

		public void selectByIndexData(WebElement element, int index, String objName) {
			

		}

		public void selectByValueData(WebElement element, String text, String objName) {
			
		}
		
		public WebElement selectFromListUsingText(List<WebElement> list, String text) {
			
			WebElement web = null;
			return web;
		}

		// ******************************select class reusable method ends**************************************

		// ******************************wait reusable method starts**************************************

		public void waitUntilPageLoads() {
			
		}
		public void waitForVisibility(WebElement ele, int time, int pollingtime, String objectName) {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait
			.withTimeout(Duration.ofSeconds(time))
			.pollingEvery(Duration.ofSeconds(pollingtime))
			.ignoring(ElementNotInteractableException.class)
			.withMessage(objectName+"is notvisible.fluent wait time expires");
			
			wait.until(ExpectedConditions.visibilityOf(ele));
			baseTestlog.info(objectName+ "is waited for visibility using fluent wait");
			
			
		}

		public void WaitUntilPresenceOfElementLocatedBy(By locator, String objName) {
			baseTestlog.info("waiting for an web element" +objName+ "for its visiblility" );
			}

		public void waitUntilElementToBeClickable(By locator, String objName) {
			
		}

		public void waitForVisibility(WebElement ele, int time, String objectName) {
			
		}

		public void waitForAlertPresent(int time) {
			
		}

		public void takescreenshot(String filepath) {
			 TakesScreenshot screenCapture=(TakesScreenshot)driver;
			 File src=screenCapture.getScreenshotAs(OutputType.FILE);
			 File destination=new File(filepath);
			 try {
				Files.copy(src, destination);
				baseTestlog.info("captured the screen");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				baseTestlog.info("went wrong when capturing the screen");
				
			}
		}

		public void takescreenshot(WebElement element,String filepath) {
			 
			 File src=element.getScreenshotAs(OutputType.FILE);
			 File destination=new File(filepath);
			 try {
				Files.copy(src, destination);
				baseTestlog.info("captured the screen");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				baseTestlog.info("went wrong when capturing the screen");
				
			}
		}
		
		
		

}
