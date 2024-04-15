package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCheckBoxes {

    WebDriver driver;

    @Test
    public void checkbox1(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1= driver.findElement(By.xpath("//form[@id='checkboxes']//child::input[@type='checkbox'][1]"));
       checkBox1.click();
       // Assert.assertEquals(checkBox1," checkbox 1");
       // Assert.assertTrue(checkBox1.isSelected());

    }
}
