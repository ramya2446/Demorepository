//package utility;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//
//public class GetScreenShot {
//	public static String capture(WebDriver driver,String screenShotName) throws IOException
//    {
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        String dest = System.getProperty("user.dir") + "/ErrorScreenshots/"+screenShotName+".png";
//        File destination = new File(dest);
//        FileUtils.copyFile(source, destination);        
//                     
//        return dest;
//    }
//
//}
