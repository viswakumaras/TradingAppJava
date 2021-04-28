package in.Trading;
import java.text.DecimalFormat;


public class CurrencyConverter {
     public static double converter(double doller,double inr) {
    	  if(doller== 0) {
    		  
    		  double dollerValue=inr*0.0134;
    		  DecimalFormat decimal = new DecimalFormat("0.0000");
    			dollerValue = Double.parseDouble(decimal.format(dollerValue));
    		  return dollerValue;
    	  }
    	  else {
    		  double inrValue=doller*74.57;
    		  DecimalFormat decimal = new DecimalFormat("0.0000");
    			inrValue = Double.parseDouble(decimal.format(inrValue));
    		  return inrValue;
    	  }
     }
}
