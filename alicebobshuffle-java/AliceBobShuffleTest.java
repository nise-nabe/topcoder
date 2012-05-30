import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AliceBobShuffleTest {

    protected AliceBobShuffle solution;

    @Before
    public void setUp() {
        solution = new AliceBobShuffle();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] AliceStart = new int[]{1, 3};
        int[] BobStart = new int[]{2, 4};
        int[] AliceEnd = new int[]{2, 3};
        int[] BobEnd = new int[]{1, 4};

        int expected = 4;
        int actual = solution.countWays(AliceStart, BobStart, AliceEnd, BobEnd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] AliceStart = new int[]{1, 2, 1};
        int[] BobStart = new int[]{1, 2};
        int[] AliceEnd = new int[]{1, 2, 1};
        int[] BobEnd = new int[]{2, 1};

        int expected = 4;
        int actual = solution.countWays(AliceStart, BobStart, AliceEnd, BobEnd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] AliceStart = new int[]{1};
        int[] BobStart = new int[]{2};
        int[] AliceEnd = new int[]{3};
        int[] BobEnd = new int[]{4};

        int expected = 0;
        int actual = solution.countWays(AliceStart, BobStart, AliceEnd, BobEnd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] AliceStart = new int[]{1, 2};
        int[] BobStart = new int[]{3};
        int[] AliceEnd = new int[]{3};
        int[] BobEnd = new int[]{2, 1};

        int expected = 0;
        int actual = solution.countWays(AliceStart, BobStart, AliceEnd, BobEnd);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] AliceStart = new int[]{3, 3, 2, 4, 1, 3, 1, 2, 1, 1, 5, 5, 1, 2, 3, 1, 2, 1, 2, 1, 1, 1, 2};
        int[] BobStart = new int[]{4, 1, 4, 3, 4, 4, 4, 3, 2, 1, 6, 2, 2, 3, 2, 2, 1, 3, 2, 3};
        int[] AliceEnd = new int[]{4, 1, 4, 3, 4, 4, 4, 1, 3, 1, 2, 2, 2, 3, 2, 1, 2, 1, 2, 2, 2};
        int[] BobEnd = new int[]{3, 3, 2, 3, 4, 2, 1, 2, 1, 1, 5, 6, 5, 1, 3, 1, 2, 3, 1, 1, 1, 3};

        int expected = 314159265;
        int actual = solution.countWays(AliceStart, BobStart, AliceEnd, BobEnd);

        Assert.assertEquals(expected, actual);
    }

}
