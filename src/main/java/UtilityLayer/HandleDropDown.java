package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	public static void selectByVisibleText(WebElement wb,String value)
	{
		Select sel = new Select(wait.visibilityofElement(wb));
		sel.selectByVisibleText(value);
		
	}
public static void selctDropDown(List<WebElement> ls,String value)
{
	for(WebElement abc:ls)
	{
		String a=abc.getText();
		if (a.equalsIgnoreCase(value))
		{
			abc.click();
		}
	}
}
	
}
