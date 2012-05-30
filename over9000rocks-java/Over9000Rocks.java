import java.util.*;

public class Over9000Rocks {

	public int countPossibilities(int[] lowerBound, int[] upperBound) {
		int n = lowerBound.length;
		int[][][] a = new int[n + 1][n + 1][2];
		for (int i = 0; i <= n; ++i) {
			for (int j = i + 1; j <= n; ++j) {
				if (i == 0) {
					a[0][j] = new int[] { lowerBound[j - 1], upperBound[j - 1] };
				} else {
					a[i][j] = new int[] { Math.max(9000, 
							Math.min(a[i][j-1][0], a[i-1][j-1][0])+lowerBound[j-1]),
							Math.max(a[i][j-1][1], a[i-1][j-1][1])+upperBound[j-1] };
				}
			}
		}
		for(int[][] b : a){
			for(int[] c : b){
				System.out.print(Arrays.toString(c)+" ");
			}
			System.out.println();
		}
		System.out.println();
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < n; ++i) {
			int[] c = new int[] { Math.max(9001, a[i + 1][n][0]),
					a[i + 1][n][1] };
			if(c[0] > c[1]){
				continue;
			}
			boolean is = true;
			for (int[] b : list) {
				if (!(c[1] < b[0] || b[1] < c[0])) {
					is = false;
					b[0] = Math.min(b[0], c[0]);
					b[1] = Math.max(b[1], c[1]);
					break;
				}
			}
			if (is) {
				list.add(c);
			}
		}
		System.out.println(list);
		int result = 0;
		for(int[] b : list){
			result += b[1] - b[0];
		}
		return result;
	}

}
