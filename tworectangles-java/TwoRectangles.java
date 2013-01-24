import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TwoRectangles {

	public String describeIntersection(int[] A, int[] B) {
		Rectangle a = new Rectangle(A[0], A[1], A[2]-A[0], A[3]-A[1]);
		Rectangle b = new Rectangle(B[0], B[1], B[2]-B[0], B[3]-B[1]);
		Rectangle2D c =  a.createIntersection(b);
		int w = (int) c.getWidth(), h = (int) c.getHeight();
		if(w > 0 && h > 0){
			return "rectangle";
		}else if (w == 0 && h == 0){
			return "point";
		}else if((w == 0 && h > 0) || (w > 0 && h == 0)){
			return "segment";
		}else{
			return "none";
		}
	}

}
