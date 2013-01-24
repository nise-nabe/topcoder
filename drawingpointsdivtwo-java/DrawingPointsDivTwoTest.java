import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DrawingPointsDivTwoTest {

    protected DrawingPointsDivTwo solution;

    @Before
    public void setUp() {
        solution = new DrawingPointsDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] points = new String[]{"*..*"};

        int expected = 1;
        int actual = solution.maxSteps(points);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] points = new String[]{"...", ".*."};

        int expected = -1;
        int actual = solution.maxSteps(points);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] points = new String[]{"*.*"};

        int expected = 0;
        int actual = solution.maxSteps(points);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] points = new String[]{"..*.", "*...", "...*"};

        int expected = 1;
        int actual = solution.maxSteps(points);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] points = new String[]{"....................", "..........*.........", "....................", ".........*..........", "....................", "....................", "....................", "....................", "....................", "....................", "....................", "....................", ".*..................", "....................", "*.............**....", "....................", "....................", "................*...", "....................", "...................."};

        int expected = 11;
        int actual = solution.maxSteps(points);

        Assert.assertEquals(expected, actual);
    }

}
