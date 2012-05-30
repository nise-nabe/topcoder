public class ElectionFraudDiv2 {

	public String IsFraudulent(int[] p) {
		int n = p.length, min = 0,max = 0;
		for(int i = 0; i < n; ++i){
			min += Math.max(0, p[i] * 100 - 50);
			max += Math.min(10000, p[i] * 100 + 49);
		}
		return min <= 10000 && 10000 <= max  ? "NO" : "YES";
	}

}
