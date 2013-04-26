public class HouseBuilding {

	public int getMinimum(String[] area) {
		int min = Integer.MAX_VALUE;
		for (char i = '0'; i <= '9'; ++i) {
			int count = 0;
			for(String line : area){
				for(char c : line.toCharArray()){
					count += Math.min(Math.abs(c - i), Math.abs(c - i - 1));
				}
			}
			min = Math.min(min, count);
		}

		return min;
	}

}
