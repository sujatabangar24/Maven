package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupEx {

    @Test(groups = {"smoke"})
    public void verifyHomePage(){
        Assert.assertTrue(false);
        System.out.println("gmail hoeme page");
    }

    @Test(groups = {"smoke"})
    public void verifyComposeMail(){
        System.out.println("Draft the mail");
    }

    @Test(enabled = false) //test case will be ignored
    public void verifySentMail(){
        System.out.println("send the mail");
    }
}
