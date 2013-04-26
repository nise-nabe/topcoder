import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheDeviceDiv2Test {

    protected TheDeviceDiv2 solution;

    @Before
    public void setUp() {
        solution = new TheDeviceDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] plates = new String[]{"010", "011", "000"};

        String expected = "NO";
        String actual = solution.identify(plates);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] plates = new String[]{"1", "0", "1", "0"};

        String expected = "YES";
        String actual = solution.identify(plates);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] plates = new String[]{"11111"};

        String expected = "NO";
        String actual = solution.identify(plates);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] plates = new String[]{"0110011", "0101001", "1111010", "1010010"};

        String expected = "NO";
        String actual = solution.identify(plates);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] plates = new String[]{"101001011", "011011010", "010110010", "111010100", "111111111"};

        String expected = "YES";
        String actual = solution.identify(plates);

        Assert.assertEquals(expected, actual);
    }

}
