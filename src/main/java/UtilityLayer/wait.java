package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class wait extends BaseClass {
	public static WebElement visibilityofElement(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(0));
	return	wait.until(ExpectedConditions.visibilityOf(wb));
		
	}

	public static List<WebElement> visibilityofAllElement(List<WebElement> ls)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(0));
		return wait.until(ExpectedConditions.visibilityOfAllElements(ls));
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		visibilityofElement(wb).sendKeys(value);
	}
	public static void click(WebElement wb)
	{
		visibilityofElement(wb).click();
	}
}
