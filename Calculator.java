package assign;
/**
 * <h1> calculator </h1>
 * the calulator program implements an application that  simply 
 * displays "simple interst, compound interest,average " of given inputs from the uesrs
 * <p>
 *@author lachlan ,flazer, jesus 
 *@version 1.0
 *@since 2022-05-05
 *
 */
public class Calculator {
public double si;
public double amount;
public double ci;
public int avg;

public Calculator() {
	
}
/**
 * This method is used calculate the simple interest of given inputs.
 * this is a the simplest form of class method to calculate simple interest
 * @param si this is the simple interests result it will store result data
 * @param p this is the initial principal balance
 * @param r this the annual interest rate
 * @param t this is the time in years
 * @return si this returns result of calculation of simple interest
 */

	public double simpleinterest(double p,double t,double r) {
		si=(p*t*r)/100;
		return si;
	}
	/**
	 * This method is used calculate the compound interest of given inputs.
	 * @param ci this is the compound interest result it will store result data
	 * @param p this is the initial principal balance
	 * @param r this the annual interest rate
	 * @param t this is the time in years
	 * @return ci this returns result of calculation of compound interest
	 */
	public double compoundinterest(double p,double r,double t) {
		amount=p*(Math.pow((1+r/100),t));
		ci=amount-p;
		return ci ;
		
		}
	/**
	 * This method is used to calculate the average of five
	 * @param num1 this is the first number
	 * @param num2 this is the second number
	 * @param num3 this is the third number 
	 * @param num4 this is the fourth number 
	 * @param num5 this is the fifth number
	 * @return average
	 */
	public int avgfive(int num1,int num2,int num3,int num4,int num5) {
		avg=(num1+num2+num3+num4+num5)/5;
		return avg;
			
	}
	/**
	 * This method is used to display the values
	 */
	
	public void display() {
		System.out.println("simple interet: "+si);
		System.out.println("compound interest : "+ci);
		System.out.println("Average of 5: "+avg);
	}

}
