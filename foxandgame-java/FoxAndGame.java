import java.util.*;

public class FoxAndGame{

	public int countStars(String[] result) {
		int c = 0;
		for(String line: result){
			c += Collections.frequency(Arrays.asList(line.split("")), "o");
		}
		return c;
	}

}
