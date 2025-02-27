package others;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijender Kumar\\eclipse-workspace\\NewFeb\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindowshandles=driver.getWindowHandles();
		System.out.println(allwindowshandles);
		Iterator<String> itr=allwindowshandles.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			driver.switchTo().window(childwindow);
		}
		

	}

}
