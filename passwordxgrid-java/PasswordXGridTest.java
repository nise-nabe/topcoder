import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordXGridTest {

    protected PasswordXGrid solution;

    @Before
    public void setUp() {
        solution = new PasswordXGrid();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] horizontal = new String[]{"1", "4"};
        String[] vertical = new String[]{"32"};

        int expected = 7;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] horizontal = new String[]{"47", "59"};
        String[] vertical = new String[]{"361"};

        int expected = 19;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] horizontal = new String[]{"36", "23", "49"};
        String[] vertical = new String[]{"890", "176"};

        int expected = 28;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] horizontal = new String[]{"8888585", "5888585"};
        String[] vertical = new String[]{"58585858"};

        int expected = 58;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] horizontal = new String[]{"7777777", "7777777", "7777777", "7777777"};
        String[] vertical = new String[]{"44444444", "44444444", "44444444"};

        int expected = 61;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        String[] horizontal = new String[]{"4361730435561224", "4551992038161587", "3735570440805759", "0223756270335979", "1448847872771839", "5627244493344288", "3489971317538245", "1509763888450324", "4728457269527002", "5755666863278619", "4910603544602386", "5288248232210552", "4232922078784475", "7701686000132776", "6094921616933212", "3388452685604018", "0966423633083486", "3030843571656889", "6717641586910730", "3098992865806937", "8214954983388709", "5838036495320030", "4818555940102803", "7276712907129813", "4463314062464452", "7803709770301151", "9125798403981291", "3045442329541143", "1366896545154597", "8712604614391045"}; 
        String[] vertical = new String[]{"78443832072673624", "69652058566013923", "39060211118085331", "81867963299250615", "93675247361756734", "59071284005557456", "84726142484539414", "26756666157625790", "67958299151230804", "35855982003962602", "00165530226661916", "97155160540745363", "51106258707111965", "96162644754123256", "29153053810079942", "05891985348819978", "67309594245394016", "95595629435802039", "33961603613708951", "64050633796226093", "51050455760046496", "22923844196110344", "06951463447119996", "49832898902648168", "76032044045426550", "05276916562453456", "50289512279543910", "94557519206195225", "25157312905124779"};

        int expected = 293;
        int actual = solution.minSum(horizontal, vertical);

        Assert.assertEquals(expected, actual);
    }

}
