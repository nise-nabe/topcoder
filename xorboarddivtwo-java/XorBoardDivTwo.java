public class XorBoardDivTwo {

	public int theMax(String[] board) {
		int  n  =board.length, m = board[0].length();
		int max = 0;
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < m; ++j){
				int count = 0;
				for(int x = 0; x < n; ++x){
					for(int y = 0; y < m; ++y){
						boolean flip = x == i  ^ y == j;
						if(board[x].charAt(y) == (flip? '0' : '1')){
							++count;
						}
					}
				}
				max = Math.max(max, count);
			}
		}
		return max;
	}

}
