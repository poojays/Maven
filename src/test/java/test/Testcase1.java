package test;

 
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

 

    public class Testcase1 {
    WebDriver driver;
    
    @BeforeMethod
    public void LaunchBrowser() {
    
    System.setProperty("webdriver.chrome.driver","/home/poojaystecnotre/Downloads/chromedriver");
    System.setProperty("webdriver.gecko.driver", "/home/poojaystecnotre/Downloads/geckodriver");
    // TODO Auto-generated method stub
    driver = new ChromeDriver();
    driver.get("https://github.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    
    }
    
@Test
   public void LoginTest() {

    LoginPage obj = new LoginPage(driver);
    obj.Login("pooja.ys@tecnotree.com","1234");
}
    
@AfterMethod
public void CloseBrowser() 
{
    driver.quit();
}
}
 