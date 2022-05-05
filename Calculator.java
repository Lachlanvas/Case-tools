package assign;

public class Calculator {
public double si;
public double amount;
public double ci;
public int avg;

public Calculator() {
	
}

	public double simpleinterest(double p,double t,double r) {
		si=(p*t*r)/100;
		return si;
	}
	public double compoundinterest(double p,double r,double t) {
		amount=p*(Math.pow((1+r/100),t));
		ci=amount-p;
		return ci ;
		
		}
	public int avgfive(int num1,int num2,int num3,int num4,int num5) {
		avg=(num1+num2+num3+num4+num5)/5;
		return avg;
			
	}
	
	public void display() {
		System.out.println("simple interet: "+si);
		System.out.println("compound interest : "+ci);
		System.out.println("Average of 5: "+avg);
	}
}
