package Steps;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageTest extends BaseClass{
public static RegisterPage rpage;
	@Given("user is on resister page")
	public void user_is_on_resister_page() {
	 
		BaseClass.initialization();
		
	}

	@When("user is enter the valid fname, lname, email, passwd")
	public void user_is_enter_the_valid_fname_lname_email_passwd() 
	{
 rpage= new RegisterPage();
 rpage.rgeisterpageFunctionality("Kishor", "Shirsath", "Kishor@gmail.com", "Kishor@1234");
	}

	@When("user enter valid date, month, year and gender")
	public void user_enter_valid_date_month_year_and_gender() 
	{
		 rpage= new RegisterPage();
		 rpage.rgeisterpageFunctionality1("8", "Feb", "1987", "female");
	}
	
}
