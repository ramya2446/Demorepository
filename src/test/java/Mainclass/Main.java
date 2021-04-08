package Mainclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Basepackage.Baseclass;
import Pages.Loginpage;





public class Main extends Baseclass{
	static ExtentTest test;
	static ExtentReports report;
	public String path = "\\Users\\Bhavani\\eclipse-workspace\\Demo\\screenshot";
 
	public Main() throws IOException{
		super();
		
	}
		
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("Main");
	}
	
			@Test(priority=0, groups= {"group1","group2"})
			public void setup() throws Exception{

				 Launchbrowser();
				 driver.get(prop.getProperty("url")); 
				
				

			}
				
				 @Test(priority=1,groups= {"group1"})
				 public void log() throws Exception{
					 Loginpage l = new Loginpage(driver);
					
					 l.getCodemail().sendKeys(prop.getProperty("Email"));
					 
					 l.getCode().click();
					 l.getClose().click();
					 
					move(l.getMousehover());
					 l.getSignin().click();
					 Thread.sleep(5000);
					 l.getEmail().click();
					 l.getEmail().sendKeys(prop.getProperty("Email"));
					 l.getPassword().sendKeys(prop.getProperty("Password"));
					 l.getLogin().click();
					 //test.log(LogStatus.PASS, "PASS");
				 }
				 
				 @Test(priority=2,groups= {"group1","group2"})
				 public void title() throws Exception{
					 
					 Thread.sleep(15000);
					 driver.navigate().refresh();
					 String actual_title = driver.getTitle();
					 String expected_title ="Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";
					 Assert.assertEquals(actual_title, expected_title);
					 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//					 if(driver.getTitle().equals("Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com"))
//					 {
//					 test.log(LogStatus.PASS, "Navigated to the specified URL");
//					 }
//					 else
//					 {
//					 test.log(LogStatus.PASS, "Test passed");
//					 }
				 }
				 
				 
				 @Test(priority=3,groups= {"group1","group2"})
					 public void selectproduct() throws Exception{
					 //l.getLivechat().click();
	                 //l.getName().sendKeys(prop.getProperty("name"));
	                 //l.getEmailaddress().sendKeys(prop.getProperty("EmailAddress"));
	                 //l.getSubmit().click();
					 Loginpage l = new Loginpage(driver);

							move(l.getMouseover());
							l.getCeilingclick().click();
							l.getChandler().click();
							l.getLargechandlier().click();
							 screenShot(path+"\\ramya1.jpeg");
							Thread.sleep(5000);
							 //test.log(LogStatus.PASS, "PASS");

							
					 }
					 
					 @Test(priority=4,groups= {"group1","group2"})
                        public void checkbox() throws Exception{
						 Loginpage l = new Loginpage(driver);

							Thread.sleep(10000);
//							
//							
							l.getCheckbox().click();
							 //test.log(LogStatus.PASS, "PASS");
							
					 }
					 
					 @Test(priority=5,groups= {"group1","group2"})
					 public void addtocart() throws Exception{
						 Loginpage l = new Loginpage(driver);
						 Thread.sleep(5000);
						 //scrollDown(l.getSelectitem());
						 
						 Actions actions = new Actions(driver);
						 	actions.moveToElement(l.getSelectitem()).click().build().perform();
						 
						 
								
						 
						 //l.getSelectitem().click();
						
						l.getAddtocart().click();
						l.getClosepopup().click();
						move(l.getCartmouse());
						// test.log(LogStatus.PASS, "PASS");

						
					 }
					 
					 @Test(priority=6,groups= {"group1","group2"})
					 public void viewcart() throws Exception{
						 Loginpage l = new Loginpage(driver);

						l.getViewcart().click();
						 //test.log(LogStatus.PASS, "PASS");

					 }
					 
					 @Test(priority=7,groups= {"group1","group2"})
					 public void removeitem() throws Exception{
						 Loginpage l = new Loginpage(driver);
						l.getMinus().click();
						 //test.log(LogStatus.PASS, "pass");

					 }
					 
					 @Test(priority=8,groups= {"group1"})
					 //@Test(priority=8,enabled=false)
					 public void signout() throws Exception{
						 Loginpage l = new Loginpage(driver);

						move(l.getMousehover());
						 l.getSignout().click();
						// test.log(LogStatus.PASS, "PASS");

					 }
					 @Test(priority=9,groups= {"group1","group2"})
					 public void driverclose() throws Exception{
						 driver.quit();
                 
}
					 
//					 @AfterMethod
//					    public void getResult(ITestResult result) throws IOException
//					    {
//					        if(result.getStatus() == ITestResult.FAILURE)
//					        {
//					            String screenShotPath = GetScreenShot.capture(driver, "screenShotName");
//					            test.log(LogStatus.FAIL, result.getThrowable());
//					            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
//					        }
//					        report.endTest(test);
//					    }
//					 
					 @AfterClass
					 public static void endTest()
					 {
					 report.endTest(test);
					 report.flush();
					 }
					 
					

}