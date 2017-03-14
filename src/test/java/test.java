import org.testng.annotations.*;

/**
 * Created by User on 14.03.2017.
 */
public class test {

    @BeforeClass
    public void setUpClass() {
        System.out.println("make before class");
    }

    @AfterClass
    public void tearDownTest(){
         System.out.println("Make after class");

    }
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("make before methode");
    }

    @AfterMethod
    public void after(){
        System.out.println("Make after methode");

    }
    @Test (groups = {"first", "smoke"})
    public void secondTest(){
        System.out.println("second test");
     print();
    }

    public void print () {
        System.out.println("xz");
    }
    @Test
    public void second2Test(){
        System.out.println("second2 test");

    }
}
