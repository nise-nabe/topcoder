public class EllysXors {

	public long getXor(long L, long R) {
		long d = R - L + 1;
		for(int i = 1; i <= d; i <<= 1){
			// i == 1: num(b(L, i),d) -> (z, o) = (d/2+(b(L,i)==0?1:0), d/2+(b(L,i)==1?1:0))
			// i == 2: num(b(L, i),d) -> (z, o) = L/i(i*(d/2+(b(L,i)==0?1:0),d/2+(b(L,i)==1?1:0)))
		}
		return 0;
	}

}
