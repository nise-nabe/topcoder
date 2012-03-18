import java.util.regex.*;

public class KingXNewBaby {

	public String isValid(String name) {
		Matcher m = Pattern.compile(".*([aiueo]).*([aiueo]).*").matcher(name);
		return m.matches() && m.group(1).equals(m.group(2)) && name.length() == 8 && name.replaceAll("[aiueo]", "").length() == 6 ? "YES" : "NO";
	}

}
