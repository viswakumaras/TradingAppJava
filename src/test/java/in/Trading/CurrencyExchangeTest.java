package in.Trading;
import java.text.DecimalFormat;

public class CurrencyExchangeTest {

	public static void main(String[] args) {
		double balance=1000;
		DecimalFormat decimal = new DecimalFormat("0.0000");
		balance = Double.parseDouble(decimal.format(balance));
		//test1 : 10,000 currency lot is used
		/**choose the lot 
		 1.(0.001) Nano lot  you get 0.01$ per pip ---100 units currency
		 2.(0.01) Micro lot  you get 0.1$ per pip  ---1000 units
		 3.(0.1) Mini lot   you get 1$ per pip ----10,000 units
		 4.(1.0) standard lot you get 10$ per pip ----100,000 units
		 **/
		double actual=CurrencyExchange.tradeProfit(10000,1.3147);//margin is at 1.3147
		 balance=balance+actual;
		 balance = Double.parseDouble(decimal.format(balance));
		System.out.println("profit or loss : "+actual);
		System.out.println("Amount Balance in your account is :"+balance);
		

	
	//test 2 :  100 unit lot is used ,margin value set 
	double actual1=CurrencyExchange.tradeProfit(100,1.3147);//
	 balance=balance+actual1;
	 balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+actual1);
	System.out.println("Amount Balance in your account is :"+balance);
	
	//test2  : 1000 unit lot is used 
	double actual2=CurrencyExchange.tradeProfit(1000,1.3147);
	 balance=balance+actual2;
	 balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+ actual2);
	System.out.println("Amount Balance in your account is :"+balance);
	
	//test3
	double actual3=CurrencyExchange.tradeProfit(100000,1.3147);
	balance=balance+actual3;
	System.out.println("profit or loss : "+actual3);
	System.out.println("Amount Balance in your account is :"+balance);
	
	
	
	  //test4
	double actual4=CurrencyExchange.tradeProfit(100000,1.3147);
	balance=balance+actual4;
	System.out.println("profit or loss : "+actual4);
	System.out.println("Amount Balance in your account is :"+balance);
	
	
	//test5
	double actual5=CurrencyExchange.tradeProfit(100000,1.3147);
	balance=balance+actual5;
	balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+actual5);
	System.out.println("Amount Balance in your account is :"+balance);
	
	
	//test6
	double actual6=CurrencyExchange.tradeLoss(1000,1.3147);
	balance=balance+actual6;
	balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+actual6);
	System.out.println("Amount Balance in your account is :"+balance);
	
	
	//test7
	double actual7=CurrencyExchange.tradeLoss(10000,1.3147);
	balance=balance+actual7;
	balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+actual7);
	System.out.println("Amount Balance in your account is :"+balance);
	
	
	//test8
	double actual8=CurrencyExchange.tradeLoss(100,1.3147);
	balance=balance+actual8;
	balance = Double.parseDouble(decimal.format(balance));
	System.out.println("profit or loss : "+actual8);
	System.out.println("Amount Balance in your account is :"+balance);
	}
}
