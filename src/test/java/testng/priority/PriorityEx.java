package testng.priority;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failedscriptexcecution.RetryFailScripts;

public class PriorityEx {

    @Test(priority = 3)
    public void priorityMethod_A(){

        System.out.println("This is first priority");

    }

    @Test(priority = 2)
    public void priorityMethod_E(){

        System.out.println("This is second last priority");

    }

    @Test(priority = 5)
    public void priorityMethod_B(){

        System.out.println("This is second priority");

    }

    @Test(priority = 1)
    public void priorityMethod_C(){

        System.out.println("This is third priority");

    }

    @Test(priority = 4)
    public void priorityMethod_D(){
        Assert.assertTrue(false);
        System.out.println("This is last priority");

    }

    @Test(priority = -7)
    public void priorityMethod_G(){
        Assert.assertTrue(false);
        System.out.println("this method is with negative priority");
    }


    @Test(priority = -3,groups = {"regression"})
    public void priorityMethod_H(){

        System.out.println("this another method with negative priority");
    }



    @Test(priority = 'B')      //will be executed last as it consider B as ASCII value
    public void priorityMethod_J(){
        System.out.println("this is method with priority assigned as a character");
    }


    @Test()
    public void priorityMethod_I(){
        System.out.println("this is second method without priority");
    }

    @Test () //without priority it considers priority 0
    public void priorityMethod_F(){
        System.out.println("this method is without priority");
    }




}
