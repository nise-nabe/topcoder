public class PlatypusPaternity {

	public int maxFamily(String[] femaleCompatibility,
			String[] maleCompatibility, String[] siblingGroups) {
		int max = 0;
		for (String female : femaleCompatibility) {
			for (String male : maleCompatibility) {
				l: for (String sibling : siblingGroups) {
					int c = 0;
					for (int i = 0; i < female.length(); ++i) {
						if (sibling.charAt(i) == 'Y') {
							if (female.charAt(i) == 'Y' && male.charAt(i) == 'Y') {
								++c;
							}else{
								continue l;
							}
						}
					}
					max = Math.max(max, c);
				}
			}
		}
		return max < 1 ? 0 : max + 2;
	}

}
