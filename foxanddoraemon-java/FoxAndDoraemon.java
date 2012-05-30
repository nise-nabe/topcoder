import java.util.Arrays;

public class FoxAndDoraemon {

	public int minTime(int[] workCost, int splitCost) {
		int n = workCost.length;
		Arrays.sort(workCost);
		if(n < 2){
			return workCost[0];
		}
		workCost[0] += splitCost;
		workCost[1] += splitCost;
		for(int i = 2; i < n; ++i){
			for(int j = 0; j < i; ++j){
				workCost[j] += splitCost;
			}
		}
		int max = 0;
		for(int w : workCost){
			max = Math.max(max, w);
		}
		return max;
	}

}
