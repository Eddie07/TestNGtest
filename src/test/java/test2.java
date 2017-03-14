import org.testng.annotations.*;

/**
 * Created by User on 14.03.2017.
 */
public class test2 {
    @BeforeClass
    public void setUpClass() {
        System.out.println("make before class 2");
    }

    @AfterClass
    public void tearDownTest(){
        System.out.println("Make after class 2");

    }
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("make before methode 2");
    }

    @AfterMethod
    public void after(){
        System.out.println("Make after methode 2");

    }
    @Test
    public void secondTest(){
        System.out.println("second test2 ");
        print();
    }

    public void print () {
        System.out.println("xz2 ");
    }
    @Test
    public void second2Test(){
        System.out.println("second2 test ");

    }
}
