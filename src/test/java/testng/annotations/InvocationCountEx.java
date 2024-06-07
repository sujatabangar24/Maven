package testng.annotations;

import org.testng.annotations.Test;

public class InvocationCountEx {


    @Test(invocationCount = 5)
    public void invocationDemo(){
        System.out.println("Invocation method Ex..");
    }


    @Test(invocationCount = 200, invocationTimeOut = 1)
    public void invocationDemoA(){
        System.out.println("invocation method with timeout ex..");    }
}
