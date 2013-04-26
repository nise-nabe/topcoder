import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HouseBuildingTest {

    protected HouseBuilding solution;

    @Before
    public void setUp() {
        solution = new HouseBuilding();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] area = new String[]{"10", "31"};

        int expected = 2;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] area = new String[]{"54454", "61551"};

        int expected = 7;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] area = new String[]{"989"};

        int expected = 0;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] area = new String[]{"90"};

        int expected = 8;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] area = new String[]{"5781252", "2471255", "0000291", "1212489"};

        int expected = 53;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testCase5() {
        String[] area = new String[]{"0"};

        int expected = 0;
        int actual = solution.getMinimum(area);

        Assert.assertEquals(expected, actual);    	
    }
}
