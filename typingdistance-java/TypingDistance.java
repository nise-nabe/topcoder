public class TypingDistance {

	public int minDistance(String keyboard, String word) {
		int sum = 0;
		for(int i = 0; i < word.length() - 1; ++i){
			sum += Math.abs(keyboard.indexOf(word.charAt(i + 1)) - keyboard.indexOf(word.charAt(i)));
		}
		return sum;
	}

}
