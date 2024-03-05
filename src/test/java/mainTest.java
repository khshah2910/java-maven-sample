import org.junit.Assert;
import org.junit.Test;

public class mainTest {

    @Test
    public void returnMessageSuccess() {
        String actual = "Greeting";
        Assert.assertEquals(actual, Main.returnMessage("Greeting"));
    }
}