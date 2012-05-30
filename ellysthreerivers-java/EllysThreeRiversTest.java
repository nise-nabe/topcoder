import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EllysThreeRiversTest {

    protected EllysThreeRivers solution;

    @Before
    public void setUp() {
        solution = new EllysThreeRivers();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int length = 10;
        int walk = 8;
        int[] width = new int[]{5, 2, 3};
        int[] swim = new int[]{5, 2, 7};

        double expected = 3.2063518370413364;
        double actual = solution.getMin(length, walk, width, swim);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int length = 1000;
        int walk = 100;
        int[] width = new int[]{91, 911, 85};
        int[] swim = new int[]{28, 97, 19};

        double expected = 21.549321613601297;
        double actual = solution.getMin(length, walk, width, swim);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int length = 666;
        int walk = 4;
        int[] width = new int[]{777, 888, 999};
        int[] swim = new int[]{11, 12, 13};

        double expected = 228.26633673141083;
        double actual = solution.getMin(length, walk, width, swim);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int length = 6;
        int walk = 100;
        int[] width = new int[]{2, 3, 4};
        int[] swim = new int[]{77, 88, 99};

        double expected = 0.12049782476139667;
        double actual = solution.getMin(length, walk, width, swim);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int length = 873;
        int walk = 54;
        int[] width = new int[]{444, 588, 263};
        int[] swim = new int[]{67, 97, 26};

        double expected = 26.365540023205206;
        double actual = solution.getMin(length, walk, width, swim);

        assertEquals(expected, actual);
    }

}
