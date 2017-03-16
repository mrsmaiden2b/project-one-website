package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Nav1_Steps 
{
	public static WebDriver driver;

	@Before
	public void setUp()
	{
		driver = new FirefoxDriver();
	}
	
	@Given("^user navigates to website home page$")
	public void user_navigates_to_website_home_page() throws Throwable 
	{
		driver.get("https://localhost/project-one-website/index");
		driver.manage().window().maximize(); 
	}

	@When("^user selects Apprenticeships Infrastructure$")
	public void user_selects_Apprenticeships_Infrastructure() throws Throwable 
	{
	  
	}

	@Then("^user is navigated to Appenticeships Infratructure page$")
	public void user_is_navigated_to_Appenticeships_Infratructure_page() throws Throwable 
	{
	    
	}

	@Then("^user selects to Apprenticeships Creative Media$")
	public void user_selects_to_Apprenticeships_Creative_Media() throws Throwable 
	{
	    
	}
	@Then("^user is navigated to Apprenticeships Creative Media page$")
	public void user_is_navigated_to_Apprenticeships_Creative_Media_page() throws Throwable 
	{
	    
	}

	@Then("^user selects Find us$")
	public void user_selects_Find_us() throws Throwable 
	{
	   
	}

	@Then("^user is navigated to Find us page$")
	public void user_is_navigated_to_Find_us_page() throws Throwable 
	{
	    
	}

	@Then("^user selects Contact$")
	public void user_selects_Contact() throws Throwable 
	{
	   
	}

	@Then("^user is navigated to Contact page$")
	public void user_is_navigated_to_Contact_page() throws Throwable 
	{

	}
}