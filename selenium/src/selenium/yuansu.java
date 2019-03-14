package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class yuansu extends jicu{
	public static WebElement a;
	public static WebElement b;
	public static void find()
	{
		a=driver.findElement(By.id("kw"));
		b=driver.findElement(By.id("su"));	
	}
}
