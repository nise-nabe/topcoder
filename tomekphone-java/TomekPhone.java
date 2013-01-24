import java.util.*;

public class TomekPhone {

	public int minKeystrokes(int[] frequencies, int[] keySizes) {
		Arrays.sort(frequencies);
		Arrays.sort(keySizes);
		int k = frequencies.length, result = 0;
		for (int i = 1; i <= keySizes[keySizes.length - 1]; ++i) {
			for(int j = 0; j < keySizes.length; ++j){
				if(i <= keySizes[j] && k > 0){
					result += i * frequencies[--k];
				}
			}
		}
		return k < 1 ? result : -1;
	}

}
