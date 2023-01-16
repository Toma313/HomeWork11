package PageObject;

import Data.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import config.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class FormPageFactory {
        @FindBy(id="input-name-consultation")
        WebElement inputName;
        @FindBy(id="input-email-consultation")
        WebElement inputEmail;
        @FindBy(id="input-tel-consultation")
        WebElement inputNumber;
        @FindBy(xpath = "//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]")
        List<WebElement> listMessenger;


        public FormPageFactory(WebDriver driver){
            PageFactory.initElements(driver,this);
        }

        public void completeForm(User us){
            inputName.sendKeys(us.getName());
            inputEmail.sendKeys(us.getEmail());
            selectMessenger(us.getMessenger());
            inputNumber.sendKeys(us.getTelephone());





    }

        private void selectMessenger(String messenger) {
            for (WebElement m :listMessenger){
                if(m.getText().equals(messenger)){
                    m.click();
                }
            }
        }
    }
