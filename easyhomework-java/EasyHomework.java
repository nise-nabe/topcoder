import java.math.BigInteger;
import java.text.ChoiceFormat;

public class EasyHomework {

	public String determineSign(int[] A) {
		BigInteger i = BigInteger.ONE;
		for(int a : A) i = i.multiply(BigInteger.valueOf(a));
		return new ChoiceFormat("-1#NEGATIVE| 0#ZERO| 0<POSITIVE").format(i.doubleValue());
	}

}
