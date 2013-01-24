public class FauxPalindromes {

	public String classifyIt(String word) {
		if (word.equals(new StringBuilder(word).reverse().toString())){
			return "PALINDROME";
		}
		String a = "";
		char x = 0;
		for(char c : word.toCharArray()){
			if (x != c){
				a += "" + (x = c);
			}
		}
		return a.equals(new StringBuilder(a).reverse().toString()) ? "FAUX" : "NOT EVEN FAUX";
	}

}
