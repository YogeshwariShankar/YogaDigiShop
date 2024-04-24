package genericLibrary;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


/**
 * This methods is used to take Screenshot, JavascriptExecutor, Mouse actions, keyboard actions, DropdownMethods, SwitchToMethods in switchToWindowByUrl, switchToWindowBytitle.
 */

public class UtilityMethods implements FrameworkConstants {
	
 
	// To use this we can create only once with the help of static
	static JavascriptExecutor jse;
	static Actions action;
	static TakesScreenshot ts;

	//WebPage screenshot
	public static String getWebPageScreenshot(WebDriver driver) {
		
		String imagePath=SCREENSHOT_PATH + getTime() +".png";
		//Step 1: Convert Webdriver reference into TakeScreenshot type
	//	TakesScreenshot ts=(TakesScreenshot)driver;

	   //Step 2: Get the screenshot and store in temp variable
    	File temp=ts.getScreenshotAs(OutputType.FILE);
	
	   //Step 3: Create a permanent File location
    	File permanent=new File(imagePath);
    	
    	//Step 4: Copy paste the image from temp to permanent location
    	    	
  	try {
    		FileHandler.copy(temp, permanent);
    
		}
    	catch (IOException e) {
			e.printStackTrace();
		}
  	return "."+imagePath;
	}
	
	//WebElement Screenshot
	public static String getWebElementScreenshot(WebElement element) {
		
		String imagePath=SCREENSHOT_PATH + getTime()+".png";
		
		//Get the screenshot and store in Temp location
		File temp =element.getScreenshotAs(OutputType.FILE);
		
		//Step 2: Create permanent file location
		File permanent=new File(imagePath);
		
		//Step 3: Copy paste the image from temp to permanent location
		//try to try catch in automatic means we have type FileHandler.copy(temp, permanent);
		//when red error is came means when placing cursor on that  and click surround try
		//catch
		
		
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "."+imagePath;
			
	}
	
//	//scroll till webdriver webelement 
//	public static void scrollIntoElementView(WebDriver driver,WebElement element, boolean position) {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].scrollIntoView("+position+")", element);
//	}
//	
//	public static void scrollBy(WebDriver driver,int x, int y) {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy("+x+","+y+")");
//	}
//	public static void scrollTo(WebDriver driver,int x, int y) {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo("+x+","+y+")");
//	}
//	
//	public static void handleDisableOrHiddenTextField(WebDriver driver, WebElement element,String value, int x, int y) {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].value='"+value+"'",element);
//	}	
//	public static void handleDisableOrHiddenbutton(WebDriver driver, WebElement element,String value, int x, int y) {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].value='"+value+"'", element );
//	}		
//	
	
	//scroll till webdriver webelement 
	//To avoid creating multiple javascript executor  we create in above 
	//static javascriptExecutor
	
	public static void scrollIntoElementView(WebElement element, boolean position) {
	jse.executeScript("arguments[0].scrollIntoView("+position+")", element);
		}
		
	public static void scrollBy(int x, int y) {
	jse.executeScript("window.scrollBy("+x+","+y+")");
		}
	public static void scrollTo(int x, int y) {
	jse.executeScript("window.scrollTo("+x+","+y+")");
		}
		
	public static void handleDisableOrHiddenTextField(WebElement element,String value) {
	jse.executeScript("arguments[0].value='"+value+"'",element);
		}	
	public static void handleDisableOrHiddenbutton(WebElement element,String value) {
	jse.executeScript("arguments[0].click()", element );
		}	
	
	//To initialize we have create below this
	public static void initObjects(WebDriver driver) {
		jse=(JavascriptExecutor)driver;
		action= new Actions(driver);
		ts = (TakesScreenshot)driver;
	}
	
	public static void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}
			
	
	public static void click(WebElement element) {
		action.click().perform();
	}
	
	public static void rightclick(WebElement element) {
		action.contextClick().perform();
	}
	
	public static void doubleClick(WebElement element) {
		action.doubleClick().perform();
	}
	
	public static void clickAndHold(WebElement element) {
		action.clickAndHold().perform();
	}
	
	public static void release(WebElement element) {
		action.release().perform();
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).perform();
	}
	
	public static void scrollByAmount(int x, int y) {
		action.scrollByAmount(x, y).perform();
	}
	
	public static void scrollToElement(WebElement element) {
		action.scrollToElement(element).perform();
	}
	
	public static void scrollFromOrigin(WebElement element, int x, int y) {
		ScrollOrigin origin=ScrollOrigin.fromElement(element);
		action.scrollFromOrigin(origin, x, y).perform();
	}
	
	public static void keyPress(Keys key) {
		action.keyDown(key).perform();
	}
	
	public static void keyRelease(Keys key) {
		action.keyUp(key).perform();
	}


	
	public static String getTime() {
		return LocalDateTime.now().toString().replace("-"," _").replace(":","_");
		
	}
		
		// create dropdown
		public static void selectOptionsByIndex(WebElement dropdown, int index) {
		  Select select=new Select(dropdown);
		  select.selectByIndex(index);
		}
		
		public static void selectOptionsByValue(WebElement dropdown, String value) {
			  Select select=new Select(dropdown);
			  select.selectByValue(value);
			}
			
		
		public static void selectOptionsByVisibletext(WebElement dropdown, String text) {
			  Select select=new Select(dropdown);
			  select.selectByVisibleText(text);
			}

		//create switch to  window
		public static void switchToWindowByTitle(WebDriver driver,String title) {
			Set<String> allWindows=driver.getWindowHandles();
			
			for(String window:allWindows) {
				driver.switchTo().window(window);
				if(driver.getTitle().contains(title)) {
					break;
				}
			}
		}
		
		public static void switchToWindowByUrl(WebDriver driver,String url) {
			Set<String> allWindows=driver.getWindowHandles();
			
			for(String window:allWindows) {
				driver.switchTo().window(window);
				if(driver.getTitle().contains(url)) {
					break;
				}
			}
		}
		
			
			
		}

