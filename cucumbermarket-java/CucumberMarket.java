public class CucumberMarket {

	public String check(int[] price, int budget, int k) {
		java.util.Arrays.sort(price);
		for (int i = 0; i < k; ++i) {
			budget -= price[price.length - i - 1];
		}
		return budget < 0 ? "NO" : "YES";
	}

}
