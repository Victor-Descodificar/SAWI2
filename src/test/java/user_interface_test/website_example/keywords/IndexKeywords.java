package user_interface_test.website_example.keywords;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import user_interface_test.website_example.pages.IndexPages;
import user_interface_test.website_example.utils.Browser;

public class IndexKeywords {
    
    private Browser browser;
    
    @Before
    public void begin(){
        browser = new Browser();
        System.out.println("First method");
    }
    
    @After
    public void end(){
        browser.closeAllBrowsers();
        System.out.println("Last method");
    }
    
    @Given("I access the Open QA Tools website")
    public void iAccessTheOpenQAToolsWebsite() {
        IndexPages indexPages  = new IndexPages();
        indexPages.open_index_page();
        indexPages.click_elements_card();
        System.out.println("Given method");
    }
    
    @When("I check it's main page")
    public void iCheckItSMainPage() {
        System.out.println("When method");
    }
    
    @Then("it should have the website logo displayed")
    public void itShouldHaveTheWebsiteLogoDisplayed() {
        System.out.println("Then method");
    }
}
