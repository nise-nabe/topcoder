public class FoxAndFlowerShopDivTwo {

	public int theMaxFlowers(String[] flowers, int r, int c) {
		int n = flowers.length, m = flowers[0].length();
		int sum = 0, result = 0;
		for(int i = 0; i < r; ++i){
			for(int j = 0; j < m; ++j){
				if(flowers[i].charAt(j) == 'F'){
					++sum;
				}
			}
		}
		result = Math.max(result, sum);
		sum = 0;
		for(int i = r + 1; i < n; ++i){
			for(int j = 0; j < m; ++j){
				if(flowers[i].charAt(j) == 'F'){
					++sum;
				}
			}
		}
		result = Math.max(result, sum);
		sum = 0;
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < c; ++j){
				if(flowers[i].charAt(j) == 'F'){
					++sum;
				}
			}
		}
		result = Math.max(result, sum);
		sum = 0;
		for(int i = 0; i < n; ++i){
			for(int j = c + 1; j < m; ++j){
				if(flowers[i].charAt(j) == 'F'){
					++sum;
				}
			}
		}
		result = Math.max(result, sum);
		
		return result;
	}

}
