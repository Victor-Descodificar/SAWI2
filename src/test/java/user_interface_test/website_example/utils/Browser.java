package user_interface_test.website_example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

public class Browser {
    
    private final WebDriverWait wait;
    public WebDriver driver;
    private final String chromeDriverPath = "C:\\Users\\vferr\\workspace\\SAWI2\\src\\main\\resources\\drivers\\chromedriver_94.exe";
    
    public Browser(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    
    public void closeAllBrowsers(){
        driver.quit();
    }
    
    public void navigateToUrl(String url){
        driver.get(url);
    }
    public void waitElementBePresent(By element){
        wait.until(presenceOfElementLocated(element));
    }
    public void waitElementBeVisible(By element){
        wait.until(visibilityOfAllElementsLocatedBy(element));
    }
    
    
}
