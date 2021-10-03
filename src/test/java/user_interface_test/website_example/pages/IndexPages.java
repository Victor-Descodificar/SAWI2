package user_interface_test.website_example.pages;

import org.openqa.selenium.By;
import user_interface_test.website_example.utils.Browser;

public class IndexPages extends Browser {

    // Locators
    String INDEX_URL = "https://demoqa.com/";
    String ELEMENTS = "div.card.mt-4.top-card";
    
    public void open_index_page(){
        driver.get(INDEX_URL);
    }
    
    public void click_elements_card(){
        waitElementBeVisible(By.cssSelector(ELEMENTS));
        driver.findElement(By.cssSelector(ELEMENTS)).click();
    }
    
}