package com.salesforce;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AccountAutomation extends SFDCLoginMethod{
	public static Logger mylog = LogManager.getLogger();
	@Test
	public void CaseNew10a() throws InterruptedException {
		
		login();
		Thread.sleep(3000);
		WebElement plus= driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		plus.click();
		WebElement customtab = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
		customtab.click();
		WebElement acctab = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[1]"));
		acctab.click();
		WebElement add = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
		add.click();
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		WebElement username1 = driver.findElement(By.id("userNav-arrow"));
		username1.click();
		WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		log.info("logout is executed");
		Thread.sleep(5000);
		WebElement username2 = driver.findElement(By.id("username"));
		username2.sendKeys("chaitz@san1.com");
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("Password@1234");
		WebElement loginbutton1 = driver.findElement(By.id("Login"));
		loginbutton1.click();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Account has been added to  tab");
	}
	@Test
	public void case10() throws InterruptedException {
		//Create and view new account
		login();
		driver.manage().window().maximize();
		WebElement accTab = driver.findElement(By.id("Account_Tab"));
		accTab.click();
		WebElement newbutton = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newbutton.click();
		WebElement AccName = driver.findElement(By.id("acc2"));
		AccName.sendKeys("Appu");
		WebElement Type = driver.findElement(By.id("acc6"));
		Type.click();
		Select s1 = new Select(Type);
		s1.selectByIndex(6);
		AccName.click();
		WebElement customerpriority = driver.findElement(By.id("00Nal000000LYgG"));
		Select s = new Select(customerpriority);
		s.selectByIndex(1);
		AccName.click();
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		driver.close();
		System.out.println("new account has been created");
			
	}
	@Test
public void case11() throws InterruptedException {
	//create new view
		login();
	driver.manage().window().maximize();
	WebElement accTab = driver.findElement(By.id("Account_Tab"));
	accTab.click();
	WebElement createnewview = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	createnewview.click();
	WebElement viewname = driver.findElement(By.id("fname"));
	viewname .sendKeys("US Accounts");
	WebElement uniquename = driver.findElement(By.id("devname"));
	uniquename.click();
	WebElement save1 = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	save1.click();
System.out.println("created a new view name and unique view name");
	
	
	
}
	@Test
public void case12() throws InterruptedException {
	//EditView
		login();
	driver.manage().window().maximize();
	WebElement accTab = driver.findElement(By.id("Account_Tab"));
	accTab.click();
	WebElement Edit = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
	Edit.click();
	WebElement viewname = driver.findElement(By.id("fname"));
	viewname.clear();
	viewname.sendKeys("USA Accounts");
	WebElement field = driver.findElement(By.id("fcol1"));
	field.click();
	Select s = new Select(field);
	s.selectByVisibleText("Account Name");
	WebElement operator = driver.findElement(By.id("fop1"));
	operator.click();
	Select s1 = new Select (operator);
	s1.selectByVisibleText("contains");
	WebElement value = driver.findElement(By.id("fval1"));
	value.clear();
	value.sendKeys("United");
	WebElement lastactivity = driver.findElement(By.xpath("//*[@id=\"colselector_select_0\"]/option[31]"));
	lastactivity.click();
	WebElement add = driver.findElement(By.xpath("//*[@id=\"colselector_select_0_right\"]/img"));
	add.click();
	WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	save.click();
	
}
@Test
public void case13() throws InterruptedException {
	//Merge Account
	 String expError = "These records will be merged into one record using the selected values. Merging can't be undone. Proceed with the record merge?";
	 login();
	driver.manage().window().maximize();
	WebElement accTab = driver.findElement(By.id("Account_Tab"));
	accTab.click();
	WebElement mergeaccount = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
	mergeaccount.click();
	WebElement aname = driver.findElement(By.id("srch"));
	aname.sendKeys("United");
	WebElement findacc = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]"));
	findacc.click();
	List<WebElement> listAccounts = driver.findElements(By.name("cid"));
	System.out.println("A:" + listAccounts.toString());
	for(int i=0;i<listAccounts.size();i++) {
		WebElement account = listAccounts.get(i);
		System.out.println(i+":"+account.isSelected());
	
		if(i>1 ) {
			account.click();
		}
		
		
	}
	WebElement next = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
	next.click();
	WebElement mergebutton = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]"));
	mergebutton.click();
	Alert al= driver.switchTo().alert();
	/*String actualError=al.getText();
	if(actualError.equals(expError)) {
		System.out.println("test case passed");
	}
	else {
		System.out.println("testcase failed");
	}*/
	al.accept();
	System.out.println("Accounts has been Merged");
	driver.close();
	
}
@Test
public void case14() throws InterruptedException {
	//create account report
	login();
	driver.manage().window().maximize();
	WebElement accTab = driver.findElement(By.id("Account_Tab"));
	accTab.click();
	WebElement report = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
	report.click();
	WebElement Datefield = driver.findElement(By.id("ext-gen148"));
	Datefield.click();
	
	
	WebElement from = driver.findElement(By.id("ext-gen152"));
	from.click();
	WebElement today = driver.findElement(By.id("ext-comp-1112"));
	today.click();
	WebElement save  = driver.findElement(By.id("ext-gen49"));
	save.click();
	//Alert al= driver.switchTo().alert();
	//al.accept();
	
	WebElement reportname = driver.findElement(By.id("saveReportDlg_reportNameField"));
	reportname.sendKeys("USA Accounts");
driver.findElement(By.id("ext-comp-1067")).click();
Thread.sleep(3000);
	WebElement saveAnDRun = driver.findElement(By.id("ext-gen299"));
	saveAnDRun.click();
	System.out.println("NEW account report has been created");
	//driver.close();
	
}
	public static void main(String[] args) throws InterruptedException {
		
		AccountAutomation a = new AccountAutomation();
		a.CaseNew10a();
		//a.case10();
		//a.case11();
		//a.case12();
		//a.case13();
		//a.case14();
		
				 		
	}

}
