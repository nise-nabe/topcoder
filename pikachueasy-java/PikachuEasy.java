public class PikachuEasy {

	public String check(String word) {
		return word.replaceAll("pi", " ").replaceAll("ka", " ")
				.replaceAll("chu", " ").replaceAll(" ", "").length() == 0 ? "YES" : "NO";
	}

}
