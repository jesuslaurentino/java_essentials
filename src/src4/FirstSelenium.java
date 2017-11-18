package src4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://newtours.demoaut.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}