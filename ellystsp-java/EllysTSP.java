public class EllysTSP {

	public int getMax(String places) {
		char[] cs = places.toCharArray();
		int c = 0;
		for(char p : cs){
			if(p == 'C'){
				++c;
			}
		}
		return (cs.length - c != c ? 1 : 0) + Math.min(cs.length - c, c) * 2;
	}

}
