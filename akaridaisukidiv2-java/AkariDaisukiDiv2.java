public class AkariDaisukiDiv2 {

	public int countTuples(String S) {
		int r = 0;
		for(int i = 1; i < S.length(); ++i){
			for(int j = i + 1; j < S.length(); ++j){
				for(int k = j + 1; k + j - i< S.length(); ++k){
					if(S.substring(i, j).equals(S.substring(k, k + j - i))){
						++r;
					}
				}
			}
		}
		return r;
	}

}
