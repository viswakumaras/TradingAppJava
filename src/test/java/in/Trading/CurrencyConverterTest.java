package in.Trading;
public class CurrencyConverterTest {

	public static void main(String[] args) {
		//test1
		double doller=0;
		double inr =400;
		double actual=CurrencyConverter.converter(doller, inr);
		System.out.println( inr+" is equal to " +actual+"$");
         
		//test2
				double doller1=20;
				double inr1 =0;
				double actual1=CurrencyConverter.converter(doller1, inr1);
				System.out.println( doller1 +" is equal to "+actual1+"Rs");
	}

}
