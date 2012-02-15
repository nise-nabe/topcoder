import java.util.*;

public class MinCostPalindrome {

	public int getMinimum(String s, int oCost, int xCost) {
		char[] cs = s.toCharArray();
		int c = 0, n = s.length();
		for (int i = 0; i < n/2; ++i) {
			if (Arrays.asList(cs[i], cs[n-i-1]).contains('?')) {
				c += cs[i]==cs[n-i-1]?2*Math.min(oCost, xCost):(cs[cs[i]=='?'?n-i-1:i]=='o'?oCost:xCost);
			}else if(cs[i]!=cs[n-i-1]){
				return -1;
			}
		}
		return c;
	}

}
