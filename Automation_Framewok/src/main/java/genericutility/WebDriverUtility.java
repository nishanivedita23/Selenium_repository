package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Nisha
 */

public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * @param driver
	 */

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will fullscreen the window
	 * @param driver
	 */
	public void fullScreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method will getsize the webpage
	 * @param driver
	 */
	
	public void getSize(WebDriver driver) {
		driver.manage().window().getSize();
	}
	
	/**
	 * This method will setsize of the webpage
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void setSize(WebDriver driver,int x,int y) {
		driver.manage().window().setSize(new Dimension(x,y));
	}
	
	/**
	 * This method will x and y co-ordinate of the webpage
	 * @param driver
	 */
	public void getPosition(WebDriver driver) {
		driver.manage().window().getPosition();
	}
	
	/**
	 * This method will set new x and y co-ordinate of the webpage
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void setPosition(WebDriver driver,int x,int y) {
		driver.manage().window().setPosition(new Point(x,y));
	}
	
	/**
	 * This method is used to perform backword  operation of the webpage
	 * @param driver
	 */
	public void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	/**
	 * this mwthod is used to perform forword operation of the webpage
	 * @param driver
	 */
	public void forword(WebDriver driver) {
		driver.navigate().forward();
	}
	
	/**
	 * this method is used to refresh or reload of the webpage
	 * @param driver
	 */
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void switchToWindow(WebDriver driver) {
		driver.getWindowHandle();
	}
	
	
	/**
	 * This method will handle multiple window id of the application
	 * @param driver
	 * @param ExpUrl
	 */
	public void switchToWindow (WebDriver driver,String ExpUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(ExpUrl)) {
				break;
			}
		}
	}
	
	
	
	/**
	 * This method will mouseHover the element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will scroll the element
	 * @param driver
	 * @param element
	 */
	public void scrollToElemet(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * This method will scroll the x and y co-ordinate
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scroll(WebDriver driver,int x,int y) {
		Actions act=new Actions(driver);
		act.scrollByAmount(x,y).perform();
	}
	
	/**
	 * This method will scroll the source and target
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target);
	}
	
	/**
	 * This method will right click of the webpage
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will right click of the element
	 * @param driver
	 * @param element
	 */
	public void rightClickOfElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method will double click of the webpage
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will double click of the element
	 * @param driver
	 * @param element
	 */
	public void doubleClickOfElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will select by index of the web element
	 * @param element
	 * @param index
	 */
	public void selectDropdown(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method will select by value of the web element
	 * @param element
	 * @param value
	 */
	public void selectDropdown(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This method will select by visibleText of the web element
	 * @param text
	 * @param element
	 */
	public void selectDropdown(String text,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will switch to frame of index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will  switch to frame of the string
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method will switch to frame of the web Element
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch to alert of the popup   
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	/**
	 * This method will switch to alert and accept of the popup
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will switch to alert and dismiss of the popup
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will take screenshot of the webpage
	 * @param driver
	 * @throws IOException
	 */
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jutil=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	/**
	 * This method will getTitle of the webPage
	 * @param expTitle
	 * @param driver
	 */
	public void switchToWindow(String expTitle,WebDriver driver) {
		Set<String> allWindowsIds = driver.getWindowHandles();
		for(String id:allWindowsIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expTitle)) {
				break;
			}
		}
	}
}
