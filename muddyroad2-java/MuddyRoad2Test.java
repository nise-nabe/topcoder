import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MuddyRoad2Test {

    protected MuddyRoad2 solution;

    @Before
    public void setUp() {
        solution = new MuddyRoad2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 5;
        int muddyCount = 1;

        int expected = 2;
        int actual = solution.theCount(N, muddyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 5;
        int muddyCount = 2;

        int expected = 2;
        int actual = solution.theCount(N, muddyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 10;
        int muddyCount = 4;

        int expected = 65;
        int actual = solution.theCount(N, muddyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 314;
        int muddyCount = 78;

        int expected = 498142902;
        int actual = solution.theCount(N, muddyCount);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 555;
        int muddyCount = 222;

        int expected = 541606281;
        int actual = solution.theCount(N, muddyCount);

        Assert.assertEquals(expected, actual);
    }

}
