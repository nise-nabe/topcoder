import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheFrogTest {

    protected TheFrog solution;

    @Before
    public void setUp() {
        solution = new TheFrog();
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
        int D = 16;
        int[] L = new int[]{2};
        int[] R = new int[]{7};

        double expected = 7.0;
        double actual = solution.getMinimum(D, L, R);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int D = 25;
        int[] L = new int[]{11, 3};
        int[] R = new int[]{21, 7};

        double expected = 10.5;
        double actual = solution.getMinimum(D, L, R);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int D = 100;
        int[] L = new int[]{0};
        int[] R = new int[]{100};

        double expected = 100.0;
        double actual = solution.getMinimum(D, L, R);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int D = 100;
        int[] L = new int[]{0, 50};
        int[] R = new int[]{50, 100};

        double expected = 50.0;
        double actual = solution.getMinimum(D, L, R);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int D = 30000;
        int[] L = new int[]{17, 25281, 5775, 2825, 14040};
        int[] R = new int[]{55, 26000, 5791, 3150, 14092};

        double expected = 787.8787878787879;
        double actual = solution.getMinimum(D, L, R);

        assertEquals(expected, actual);
    }

}
