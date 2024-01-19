package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;

public class RegisterPage extends BaseClass {
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	
	@FindBy(name="birthday_day")
	private WebElement bday;
	
	@FindBy(name="birthday_month")
	private WebElement bmonth;
	
	@FindBy(name="birthday_year")
	private WebElement byear;
	
	@FindBys(@FindBy(xpath="//label[@class='_58mt']"))
	private List<WebElement> ls;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void rgeisterpageFunctionality(String Fname,String Lname,String Email,String Pass)
	{
		UtilityLayer.wait.sendKeys(fname, Fname);
		UtilityLayer.wait.sendKeys(lname, Lname);
		UtilityLayer.wait.sendKeys(email, Email);
		UtilityLayer.wait.sendKeys(pass, Pass);

}
	public void rgeisterpageFunctionality1(String Bday,String Bmonth,String Byear,String Gender)
	{
	
HandleDropDown.selectByVisibleText(bday, Bday);
HandleDropDown.selectByVisibleText(bmonth, Bmonth);
HandleDropDown.selectByVisibleText(byear, Byear);
HandleDropDown.selctDropDown(ls, Gender);
}
	
}

	
