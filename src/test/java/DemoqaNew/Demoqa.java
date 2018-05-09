package DemoqaNew;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Demoqa {
	WebDriver driver;
	@Given("^The user is in Demoqa site$")
	public void the_user_is_in_Demoqa_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^The user given the values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_given_the_values(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7,String arg8) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys(arg1);
	    driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys(arg2);
	    driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys(arg3);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(arg4);
	    driver.findElement(By.xpath("//input[@id='email_1']")).sendKeys(arg5);
	    driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(arg6);
	    driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys(arg7);
	    driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys(arg8);
	}


	@Then("^The user verifies items are sucessfully added$")
	public void the_user_verifies_items_are_sucessfully_added() throws Throwable {
		Assert.assertEquals("Prabakaran", driver.findElement(By.xpath("//input[@id='name_3_firstname']")).getAttribute("value"));
		Assert.assertEquals("Ramamoorthy", driver.findElement(By.xpath("//input[@id='name_3_lastname']")).getAttribute("value"));
		Assert.assertEquals("8608707070", driver.findElement(By.xpath("//input[@id='phone_9']")).getAttribute("value"));
		Assert.assertEquals("prabakaran", driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value"));
		Assert.assertEquals("prabakaran@gmail.com", driver.findElement(By.xpath("//input[@id='email_1']")).getAttribute("value"));
		Assert.assertEquals("sdhjfdhjfdhd", driver.findElement(By.xpath("//textarea[@id='description']")).getAttribute("value"));
		Assert.assertEquals("pragate123", driver.findElement(By.xpath("//input[@id='password_2']")).getAttribute("value"));
		Assert.assertEquals("pragate123", driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).getAttribute("value"));
	}
	
	@When("^The user select the radio button \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_select_the_radio_button(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.xpath("//input[@value='single']"));
		driver.findElement(By.xpath("//input[@value='married']"));
		driver.findElement(By.xpath("//input[@value='divorced']")).click();
	   
	}

	@Then("^The user verifies radio button is selected or not$")
	public void the_user_verifies_radio_button_is_selected_or_not() throws Throwable {
		Assert.assertEquals("Divorced", driver.findElement(By.xpath("//input[@value='divorced']")));
	}
	
}
