package testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestEx {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before test demo for BeforeAfterTestEx");
    }

    @AfterTest
    public void AfterTestDemo(){
        System.out.println("After test demo for BeforeAfterTestEx");
    }

    @Test
    public void verifyTestCase_1(){
        System.out.println("verify test case first");
    }


    @Test
    public void verifyTestCase_2(){
        System.out.println("verify test case second");
    }


}
