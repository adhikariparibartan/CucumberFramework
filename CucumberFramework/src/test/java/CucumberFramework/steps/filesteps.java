package CucumberFramework.steps;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class filesteps {
	WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() +  "/src/test/java/CucumberFramework/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown() {
		driver.manage().deleteAllCookies();
	//	driver.quit();
	}
	

@Given("^user open to \"([^\"]*)\"$")
public void user_open_to(String arg1) throws Throwable {
    driver.get(arg1);
}

@When("^user clicks on  Contact US page$")
public void user_clicks_on_Contact_US_page() throws Throwable {
 driver.findElement(By.xpath("//*[@id=\"menu_main\"]/li[3]/a")).click();
	
}

@When("^user enters your name as \"([^\"]*)\"$")
public void user_enters_your_name_as(String arg1) throws Throwable {
driver.findElement(By.className("sc_form_field sc_form_field_name required")).sendKeys("Sunita");


}
@When("^user enter  your email as \"([^\"]*)\"$")
public void user_enter_your_email_as(String arg1) throws Throwable {
   driver.findElement(By.name("email")).sendKeys("Sunita7141@gmail.com");
}
@When("^user enter message as  \"([^\"]*)\"$")
public void user_enter_message_as(String arg1) throws Throwable {
   driver.findElement(By.name("message")).sendKeys("Thank you Paribartan ji for helping me to learn QA course and figure out the problem");
}

@When("^user send the message$")
public void user_send_the_message() throws Throwable {
    driver.findElement(By.className("sc_button_hover_slide_left")).click();
}
}
