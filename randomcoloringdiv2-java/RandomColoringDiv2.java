public class RandomColoringDiv2 {

	public int getCount(int maxR, int maxG, int maxB, int startR, int startG,
			int startB, int d1, int d2) {
		int c = 0;
		for(int r = 0; r < maxR; ++r){
			for(int g = 0; g < maxG; ++g){
				for(int b = 0; b < maxB; ++b){
					if(Math.abs(startR - r) <= d2 && Math.abs(startG - g ) <= d2 && Math.abs(startB - b) <= d2 
							&& (Math.abs(startR - r) >= d1 || Math.abs(startG - g) >= d1 || Math.abs(startB - b) >= d1)){
						++c;
					}
				}
			}
		}
		return c;
	}

}
