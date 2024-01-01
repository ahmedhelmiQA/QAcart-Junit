import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void b() {
        System.out.println("the is the first test case");
        Assertions.assertEquals(11,11);
        Assertions.assertTrue(false);

    }

    @Test
    public void a() {
        System.out.println("the is the second test case");
        Assertions.assertTrue(true);
    }
}
