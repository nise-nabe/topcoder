import java.util.*;

public class FoxAndMp3Easy {

	public String[] playList(int n) {
		List<String> list = new ArrayList<String>();
		for(int i = 1; i <= n; ++i){
			list.add(i + ".mp3");
		}
		Collections.sort(list);
		return list.subList(0, Math.min(50, list.size())).toArray(new String[0]);
	}

}
