public class GreatFairyWar {

	public int minHP(int[] dps, int[] hp) {
		int n = dps.length;
		int result = 0;
		for(int i = 0; i < n; ++i){
			for(int j = i; j < n; ++j){
				result += hp[i] * dps[j];
			}
		}
		return result;
	}

}
