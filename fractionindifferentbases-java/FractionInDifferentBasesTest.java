import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FractionInDifferentBasesTest {

    protected FractionInDifferentBases solution;

    @Before
    public void setUp() {
        solution = new FractionInDifferentBases();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long P = 1L;
        long Q = 2L;
        long A = 10L;
        long B = 10L;

        long expected = 0L;
        long actual = solution.getNumberOfGoodBases(P, Q, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long P = 1L;
        long Q = 9L;
        long A = 9L;
        long B = 10L;

        long expected = 1L;
        long actual = solution.getNumberOfGoodBases(P, Q, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long P = 5L;
        long Q = 6L;
        long A = 2L;
        long B = 10L;

        long expected = 8L;
        long actual = solution.getNumberOfGoodBases(P, Q, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long P = 2662L;
        long Q = 540L;
        long A = 2L;
        long B = 662L;

        long expected = 639L;
        long actual = solution.getNumberOfGoodBases(P, Q, A, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long P = 650720L;
        long Q = 7032600L;
        long A = 2012L;
        long B = 2012540L;

        long expected = 2010495L;
        long actual = solution.getNumberOfGoodBases(P, Q, A, B);

        Assert.assertEquals(expected, actual);
    }

}
