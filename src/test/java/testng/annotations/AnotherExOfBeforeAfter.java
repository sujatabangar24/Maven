package testng.annotations;

import org.testng.annotations.*;

public class AnotherExOfBeforeAfter {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before test demo");
    }

    @AfterTest
    public void AfterTestDemo(){
        System.out.println("After test demo");
    }


    @BeforeClass
    public void BeforeClassMethod(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){System.out.println("Before Method");}

@Test
public void testCase1(){System.out.println("This is first test case");}

@Test
public void testCase2(){
    System.out.println("This is second test case");
}

    @AfterMethod
    public void afterMethod(){System.out.println("After Method");}

    @AfterClass
    public void afterClassEx(){System.out.println("After class");}
}
