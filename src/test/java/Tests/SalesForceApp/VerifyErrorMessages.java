package Tests.SalesForceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyErrorMessages {
    WebDriver driver;

    @BeforeTest
    public void salesForceAppLaunch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
    }


    @Test
    public void verifyErrorMessagesOfAllInputBoxes() {


        WebElement startMyFreeTrailButton = driver.findElement(By.xpath("//button[text()='start my free trial']"));

        startMyFreeTrailButton.click();

        System.out.println("startMyFreeTrailButton: : " + startMyFreeTrailButton);


   //     Assert.assertTrue(startMyFreeTrailButton.isEnabled());

        WebElement firstNameErrorMessage = driver.findElement(By.xpath("//div[@class='field error']/child::span[text()='Enter your first name']"));
        firstNameErrorMessage.click();

       System.out.println("firstName Error Message : : " + firstNameErrorMessage);


   // ok     Assert.assertEquals(firstNameErrorMessage, "Enter your first name");

        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class='field error']/child::span[text()='Enter your first name']")).isEnabled());

        /*lastNameErrorMessage****************/

        WebElement lastNameErrorMessage = driver.findElement(By.xpath("//div[@class='field error']/child::input[@name='UserLastName']"));
        lastNameErrorMessage.click();

     //   Assert.assertEquals(lastNameErrorMessage, "Enter your last name");

        System.out.println("lastNameErrorMessage : : " + lastNameErrorMessage);


        /**********************************************************/

        WebElement iAgreeToTheCheckbox = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
        iAgreeToTheCheckbox.click();

        System.out.println("iAgreeToTheCheckbox : : " + iAgreeToTheCheckbox);


    }

  /*  @Test//pending
  //  public void verifyDropDowns() {
        WebElement selectYourTitleErrorMessage = driver.findElement(By.cssSelector("[id^='UserTitle']"));
        Select dropDownSelect = new Select(selectYourTitleErrorMessage);


        Assert.assertEquals(selectYourTitleErrorMessage, "selectYourTitleErrorMessage");


    }

    @Test
    public void iAgreeToThecheckbox() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();



        WebElement iAgreeToTheCheckbox = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
        iAgreeToTheCheckbox.click();
    }*/
}