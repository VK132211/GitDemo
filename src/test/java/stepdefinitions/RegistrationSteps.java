package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps 
{
	WebDriver driver;
	//Global Hooks
	@Before
	public void InitializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Browser Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}

	@After
	public void closeBrowser()
	{
		driver.quit();
	}

	@Given("^User is on Application Home Page$")
	public void user_is_on_Application_Home_Page() 
	{
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@When("^Application Page Title is Basic Contact Form - myContactForm\\.com$")
	public void application_Page_Title_is_Basic_Contact_Form_myContactForm_com() 
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Basic Contact Form - myContactForm.com";
	    Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String name, String email) 
	{
		driver.findElement(By.name("q[1]")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		
	}
	
	@Then("^user enters message$")
	public void user_enters_message()
	{
		 driver.findElement(By.name("q[2]")).sendKeys("My friend!");

	}
	
	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() 
	{
		  driver.findElement(By.name("submit")).click();
		  System.out.println("contact form submitted!!");

	}
	
	@When("^User navigate to confirmation page$")
	public void user_navigate_to_confirmation_page()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Thank You - myContactForm.com";
	    Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);

	}
	
	@Then("^close the browser$")
	public void close_the_browser()
	{
		System.out.println("Close browser");
		driver.close();

		
	}


}
