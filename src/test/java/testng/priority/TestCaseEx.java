package testng.priority;

import org.testng.annotations.Test;


//TestNG executes test cases in alphabetical order by default

public class TestCaseEx {

    @Test

    public void priorityMethod_A(){

        System.out.println("This is first priority");

    }

    @Test
    public void priorityMethod_E(){

        System.out.println("This is second last priority");

    }

    @Test(groups = {"regression"})
    public void priorityMethod_B(){

        System.out.println("This is second priority");

    }

    @Test(groups = {"sanity"})
    public void priorityMethod_C(){

        System.out.println("This is third priority");

    }

    @Test

    public void priorityMethod_D(){

        System.out.println("This is last priority");

    }


}
