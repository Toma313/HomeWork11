package TestHillelCons;

import PageObject.PageObjectCourses;
import config.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testsJavaBasic extends BaseClass {
     static PageObjectCourses pageObjectCourses;
    @BeforeClass
    public static void createMethod(){
        driver.get("https://ithillel.ua/courses/java-basic");
        pageObjectCourses = new PageObjectCourses(driver);
    }
    @Test
    public void test1(){
        System.out.println("Title: "+pageObjectCourses.getCourseTitle());
    }
    @Test
    public void test2(){
        System.out.println("Ride: "+pageObjectCourses.getCourseRide());
    }
    @Test
    public void test3(){
        System.out.println("Description: "+pageObjectCourses.getCourseDescription());
    }


}
