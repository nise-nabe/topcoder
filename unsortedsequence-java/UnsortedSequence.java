import java.util.*;

public class UnsortedSequence {

	public int[] getUnsorted(int[] s) {
		Arrays.sort(s);
		for (int i = s.length; i-- > 1;) {
			if (s[i - 1] != s[i]) {
				int t = s[i - 1];
				s[i - 1] = s[i];
				s[i] = t;
				return s;
			}
		}
		return new int[] {};
	}

}
