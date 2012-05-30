import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class StrangeDictionaryTest {

    protected StrangeDictionary solution;

    @Before
    public void setUp() {
        solution = new StrangeDictionary();
    }

    public static void assertArrayEquals(double[] expected, double[] actual) {
        boolean failed = (actual == null || (expected.length != actual.length));
        for (int i = 0; i < expected.length && !failed; i++) {
            if (Double.isNaN(expected[i]) && !Double.isNaN(actual[i])) {
                failed = true;
            } else {
                double delta = Math.max(1e-9, 1e-9 * Math.abs(expected[i]));
                failed = (Math.abs(actual[i] - expected[i]) > delta);
            }
        }
        if (failed) {
            Assert.fail("expected:<" + Arrays.toString(expected) + ">, but was:<" + Arrays.toString(actual) + ">");
        }
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] words = new String[]{"hardesttestever"};

        double[] expected = new double[]{0.0};
        double[] actual = solution.getExpectedPositions(words);

        assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] words = new String[]{"ab", "ba"};

        double[] expected = new double[]{0.5, 0.5};
        double[] actual = solution.getExpectedPositions(words);

        assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] words = new String[]{"aza", "aab", "bba"};

        double[] expected = new double[]{1.0, 0.8333333333333333, 1.1666666666666665};
        double[] actual = solution.getExpectedPositions(words);

        assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] words = new String[]{"abababab", "babababa", "acacacac", "cacacaca", "bcbcbcbc", "cbcbcbcb"};

        double[] expected = new double[]{1.0, 1.0, 2.5, 2.5, 4.0, 4.0};
        double[] actual = solution.getExpectedPositions(words);

        assertArrayEquals(expected, actual);
    }

}
