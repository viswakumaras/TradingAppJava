package in.Trading;

import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class CurrencyExchange {
	
		/**There are 3 kind of lots 
		 1.(0.001) Nano lot  you get 0.001$ per pip ---100 units currency
		 2.(0.01) Micro lot  you get 0.01$ per pip  ---1000 units
		 3.(0.1) Mini lot   you get 0.1$ per pip ----10,000 units
		 4.(1.0) standard lot you get 1$ per pip ----100,000 units
		  1st @param selection of lot
		  2nd @param is value to buy at point
		  3rd @param is value to sell at point
		  //Features 
		   * 1.Currency exchange with random pip 
		   * 2.Currency converter
		 **/

	public static double tradeProfit(double lot,double buy) {
		double min=1.3147;
		double max=1.3192;
		double maximum= ThreadLocalRandom
	            .current()
	            .nextDouble(min, max);
	
		double pip1=maximum-min;
		
		DecimalFormat decimal = new DecimalFormat("0.0000");
		pip1 = Double.parseDouble(decimal.format(pip1));
	
		double returnValue=lot*pip1;
		return returnValue;
		    
	}
	public static double tradeLoss(double lot,double buy) {
		double min=1.3147;
		double max=1.3192;
		double maximum= ThreadLocalRandom
	            .current()
	            .nextDouble(min, max);
	
		double pip1=min-maximum;
		
		DecimalFormat decimal = new DecimalFormat("0.0000");
		pip1 = Double.parseDouble(decimal.format(pip1));
	
		double returnValue=lot*pip1;
		returnValue = Double.parseDouble(decimal.format(returnValue));
		return returnValue;
	}

}
