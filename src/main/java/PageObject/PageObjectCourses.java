package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectCourses {
    private WebDriver driver;
    By courseTitle = By.xpath("//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[1]/div/h1/span[1]");
    By courseRide = By.xpath("//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[2]/div/span");
    By courseDescription = By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/p");
    public PageObjectCourses(WebDriver webdriver){
        this.driver= webdriver;

    }
    public String getCourseTitle(){
        return driver.findElement(courseTitle).getText();
    }
    public String getCourseRide(){
        return driver.findElement(courseRide).getText();
    }
    public String getCourseDescription(){
        return driver.findElement(courseDescription).getText();
    }
}
