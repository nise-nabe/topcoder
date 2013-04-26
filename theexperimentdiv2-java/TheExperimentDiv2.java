import java.util.Arrays;

public class TheExperimentDiv2 {

	public int[] determineHumidity(int[] intensity, int L, int[] leftEnd) {
		int l = intensity.length;
		int[]result = new int[leftEnd.length];
		for(int i = l; i-->0;){
			for(int j = 0; j < leftEnd.length; ++j){
				if(leftEnd[j] <= i && i < leftEnd[j] + L ){
					result[j] += intensity[i];
					break;
				}
			}
		}
		return result;
	}

}
