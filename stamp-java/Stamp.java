import java.util.*;

public class Stamp {

	public int getMinimumCost(String desiredColor, int stampCost, int pushCost) {
		int n = desiredColor.length();
		int[] dp = new int[n + 1];
		for(int l = 1; l < n; ++l){
			char[] cs = desiredColor.toCharArray();
			for(int i = 0; i < n - l; ++i){
				if(isSameColor(cs, i, l)){
					dp[i + l] = Math.min(dp[i + l], (i < 1 ? 0: dp[i - 1]) + pushCost);
				}
			}
			
		}
		return dp[n];
	}
	
	private boolean isSameColor(char[] line, int i, int l){
		Set<String> set = new HashSet<String>(Arrays.asList(new String(line).substring(i, i + l).split("")));
	    return set.size() - 1 - (set.contains("*") ? 1 : 0) == 1;
	}

}
