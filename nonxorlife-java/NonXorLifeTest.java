import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonXorLifeTest {

    protected NonXorLife solution;

    @Before
    public void setUp() {
        solution = new NonXorLife();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] field = new String[]{"oo", "o."};
        int K = 3;

        int expected = 36;
        int actual = solution.countAliveCells(field, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] field = new String[]{"..", ".."};
        int K = 23;

        int expected = 0;
        int actual = solution.countAliveCells(field, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] field = new String[]{"o"};
        int K = 1000;

        int expected = 2002001;
        int actual = solution.countAliveCells(field, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] field = new String[]{"o.oo.ooo", "o.o.o.oo", "ooo.oooo", "o.o..o.o", "o.o..o.o", "o..oooo.", "..o.o.oo", "oo.ooo.o"};
        int K = 1234;

        int expected = 3082590;
        int actual = solution.countAliveCells(field, K);

        Assert.assertEquals(expected, actual);
    }

}
