public class LeftOrRight {
 
  public int maxDistance(String p) {
    return maxDist(p, 0, 0);
  }
 
  int max = 0;
 
  int maxDist(String p, int x, int h) {
    if (p.length() != 0) {
      String ss = p.substring(1);
      if (p.charAt(0) == '?') {
        if (h == 0) {
          maxDist(ss, x + 1, 1);
          maxDist(ss, x - 1, -1);
        } else {
          maxDist(ss, x + h, h);
        }
      } else if (p.charAt(0) == 'R') {
        maxDist(ss, x + 1, 0);
      } else {
        maxDist(ss, x - 1, 0);
      }
    }
    return max = Math.max(max, Math.abs(x));
  }
}