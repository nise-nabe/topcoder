import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EvenRouteTest {

    protected EvenRoute solution;

    @Before
    public void setUp() {
        solution = new EvenRoute();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{-1, -1, 1, 1};
        int[] y = new int[]{-1, 1, 1, -1};
        int wantedParity = 0;

        String expected = "CAN";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-5, -3, 2};
        int[] y = new int[]{2, 0, 3};
        int wantedParity = 1;

        String expected = "CAN";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{1001, -4000};
        int[] y = new int[]{0, 0};
        int wantedParity = 1;

        String expected = "CAN";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{11, 21, 0};
        int[] y = new int[]{-20, 42, 7};
        int wantedParity = 0;

        String expected = "CANNOT";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{0, 6};
        int[] y = new int[]{10, -20};
        int wantedParity = 1;

        String expected = "CANNOT";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] x = new int[]{415859, -668713, 661850, 419241, 802599, 830142, 494076, -296749, 543803, -526941, 855859, 761278, -639732, 19849, -815787, -617325, -422501, -581360, -582792, 699804, 252729, 522525, 688955, -300183};
        int[] y = new int[]{-522552, 390564, -293645, -425326, -104040, -272277, 470695, 252190, -469662, -710024, -94433, 665413, -58619, -840488, 808406, 630204, -588536, -532153, -98977, 30031, -446338, -882668, -194650, 501100};
        int wantedParity = 0;

        String expected = "CAN";
        String actual = solution.isItPossible(x, y, wantedParity);

        Assert.assertEquals(expected, actual);
    }

}
