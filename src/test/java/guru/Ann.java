package guru;

import org.junit.*;

public class Ann {


    @BeforeClass
    public static void classBefore(){
        System.out.println("One time in the beginning");
    }

    @AfterClass
    public static void classAfter(){
        System.out.println("One time in the end");
    }

    @Before
    public void setup(){
        System.out.println("Setup here");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @After
    public void cleanUP(){
        System.out.println("CleanUp");
    }

}
