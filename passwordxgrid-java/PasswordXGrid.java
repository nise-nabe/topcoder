public class PasswordXGrid {

	public int minSum(String[] h, String[] v) {
		int n = v.length, m = h[0].length();
		int[][] a = new int[n+1][m+1];
		for(int i = 0; i < n; ++i){
			a[i+1][0] = a[i][0] + v[i].charAt(0) - '0';
		}
		for(int j = 0; j < m; ++j){
			a[0][j+1] = a[0][j] + h[0].charAt(j) - '0';
		}
		for(int i = 1; i <= n; ++i){
			for(int j = 1; j <= m; ++j){
				a[i][j] = Math.max(a[i - 1][j] + v[i-1].charAt(j) - '0', a[i][j-1] + h[i].charAt(j - 1) - '0');
			}
		}
	    for(int i = 0; i <=n; ++i){
	    	System.out.println(java.util.Arrays.toString(a[i]));
	    }
		return a[n][m];
	}

}
