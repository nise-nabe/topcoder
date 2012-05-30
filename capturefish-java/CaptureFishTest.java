import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaptureFishTest {

    protected CaptureFish solution;

    @Before
    public void setUp() {
        solution = new CaptureFish();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String fish = "OXOXO";

        int expected = 0;
        int actual = solution.getParity(fish);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String fish = "OO";

        int expected = 1;
        int actual = solution.getParity(fish);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String fish = "**OX**";

        int expected = 0;
        int actual = solution.getParity(fish);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String fish = "O***O***O***O";

        int expected = 1;
        int actual = solution.getParity(fish);

        Assert.assertEquals(expected, actual);
    }

}
