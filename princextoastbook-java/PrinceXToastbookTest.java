import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrinceXToastbookTest {

    protected PrinceXToastbook solution;

    @Before
    public void setUp() {
        solution = new PrinceXToastbook();
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
        int[] prerequisite = new int[]{-1, 0};

        double expected = 1.5;
        double actual = solution.eat(prerequisite);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] prerequisite = new int[]{-1, 0, 1};

        double expected = 1.6666666666666667;
        double actual = solution.eat(prerequisite);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] prerequisite = new int[]{1, -1, 1};

        double expected = 2.0;
        double actual = solution.eat(prerequisite);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] prerequisite = new int[]{1, 0};

        double expected = 0.0;
        double actual = solution.eat(prerequisite);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] prerequisite = new int[]{-1, -1};

        double expected = 2.0;
        double actual = solution.eat(prerequisite);

        assertEquals(expected, actual);
    }

}
