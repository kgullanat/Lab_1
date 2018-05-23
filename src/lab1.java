import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class lab1 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/NPRU/Downloads/Selenium �Ҫ�Ѯ��û��/Jar/BrowserDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/NPRU/Downloads/Selenium �Ҫ�Ѯ��û��/Jar/BrowserDriver/geckodriver.exe");
			driver = new FirefoxDriver();
	
		}
		
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:/Users/NPRU/Downloads/Selenium �Ҫ�Ѯ��û��/Jar/BrowserDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/NPRU/Downloads/Selenium �Ҫ�Ѯ��û��/Jar/BrowserDriver/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			
		}
		
		driver.get("http://www.google.co.th");
		System.out.println(browser+"is running");
		System.out.println(""+driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
		System.out.println("Finish !!!");
	}
	

}
