public class PairingPawns {

	public int savedPawnCount(int[] start) {
		for(int i = start.length; i -->1;){
			start[i - 1] += start[i] / 2;
		}
		return start[0];
	}

}
