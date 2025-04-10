package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static String browsername;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() {
		
		 
		
		try {
			browsername=FetchdatafromProperty.fetchDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	if(browsername.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		try {
			driver.get(FetchDataFromExcel.getURL(1, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	if(browsername.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		try {
			driver.get(FetchDataFromExcel.getURL(1, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	if(browsername.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		try {
			driver.get(FetchDataFromExcel.getURL(1, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	return driver;	
}
	public static void getTitle() {
		String Title =  driver.getTitle();
		System.out.println("The Title of the Page is "+Title);
	}
	
	public static void TakeScreenshot() throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\Pictures\\Takescreenshots\\FinalOutput.jpeg");
	    FileUtils.copyFile(f,des);
	}
	
	public static void scrolldown() throws InterruptedException {
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void addImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void clickBack() {
		driver.navigate().back();
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
}
