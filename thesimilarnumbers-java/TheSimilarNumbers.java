public class TheSimilarNumbers {

	public int find(int lower, int upper) {
		int count = 1;
		while(lower <= upper){
			if(lower * 10 +1 <= upper){
				++count;
			}
			lower = lower * 10 + 1;
		}
		return count;
	}

}
