package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodEx {

    @Test
    public void verifyLogin(){
       Assert.assertTrue(false);
        System.out.println("Log into Gmail");
    }

    @Test(dependsOnMethods = "verifyLogin",alwaysRun = true) //when want to run the test case always even if parent testcase fails
    public void verifyHomePage(){
        System.out.println("Gmail home page");
    }

    @Test(groups = {"sanity"})
    public void verifycomposeMail(){
        System.out.println("Draft the mail");
    }

    @Test(groups = {"regression"})
    public void verifysentMail(){
        System.out.println("Send the mail");
    }
}
