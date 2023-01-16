package TestHillelCons;

import Data.User;
import PageObject.FormPageFactory;
import config.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests extends BaseClass {
    static FormPageFactory formFactory;
    @BeforeClass
    public static void start() throws InterruptedException {
        driver.get("https://ithillel.ua/courses");
        Thread.sleep(2000);
        formFactory = new FormPageFactory(driver);
    }
    @Test
    public void test1() {
        System.out.println("Title: "+driver.getTitle());
    }
        @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/main/div/div[2]/div/div/button")).click();
        formFactory.completeForm(new User());
        Thread.sleep(3000);
    }
}

