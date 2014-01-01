/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.scraper;

    
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


/**
 *
 * @author Himesh_2
 */
public class seleniumtest {

    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("https://www.keellssuper.com/defaultnew.asp");

        System.out.println(driver.getPageSource());
        

        WebElement ul2 = driver.findElement(By.className("DeliCity"));
        selectValueFromUnorderedList(ul2, "Dehiwala");
        
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("CheckCity('A');");
        }
        
        
        // Find the text input element by its name
    //    WebElement element = driver.findElement(By.name("MainDeliCity"));
     System.out.println(driver.getPageSource());
        
    //    element.sendKeys("Biyagama");
      //  clickThis.SelectByText("Germany");
        
        // Enter something to search for
   //     element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
 //       element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
    }
    
    
    // credit goes to 
    // http://stackoverflow.com/questions/16458538/how-to-select-value-from-dropdown-using-java-selenium-web-driver
    public static void selectValueFromUnorderedList(WebElement unorderedList, final String value) {
        List<WebElement> options = unorderedList.findElements(By.tagName("li"));

        for (WebElement option : options) {
            if (value.equals(option.getText())) {
                option.click();
                break;
            }
        }
    }
}

