import java.util.*;
import java.math.*;

public class CuttingBitString {

	public int getmin(String S) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <= 21; ++i) {
			list.add(BigInteger.valueOf(5).pow(i).toString(2));
		}
		int n = S.length();
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE / 2);
		dp[0] = 0;
		for (int i = 1; i <= n; ++i) {
			for (String str : list) {
				int k = i - str.length();
				if (k >= 0 && S.substring(k, i).equals(str)) {
					dp[i] = Math.min(dp[i], dp[k] < 0 ? -1 : dp[k] + 1);
				}
			}
		}
		return dp[n] == Integer.MAX_VALUE / 2 ? -1 : dp[n];
	}
}
