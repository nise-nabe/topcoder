import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryPolynomialDivOneTest {

    protected BinaryPolynomialDivOne solution;

    @Before
    public void setUp() {
        solution = new BinaryPolynomialDivOne();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] a = new int[]{1, 0, 1};
        long m = 3L;
        long k = 4L;

        int expected = 1;
        int actual = solution.findCoefficient(a, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] a = new int[]{1, 0, 1};
        long m = 3L;
        long k = 5L;

        int expected = 0;
        int actual = solution.findCoefficient(a, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] a = new int[]{0, 0, 1, 1, 0, 1};
        long m = 7L;
        long k = 15L;

        int expected = 1;
        int actual = solution.findCoefficient(a, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] a = new int[]{1};
        long m = 1L;
        long k = 0L;

        int expected = 1;
        int actual = solution.findCoefficient(a, m, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] a = new int[]{1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1};
        long m = 2229508454872453L;
        long k = 96130299655104846L;

        int expected = 1;
        int actual = solution.findCoefficient(a, m, k);

        Assert.assertEquals(expected, actual);
    }

}
