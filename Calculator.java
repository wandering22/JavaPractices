 class Cal{
	int num1;
	int num2;
	
	Cal(){
		num1=1;
		num2=2;
	}
	double add(){
		double c=num1+num2;
		System.out.println(c);
		return c;
	}
	double sub(){
		double c=num1-num2;
		return c;
	}
	double multply(){
		double c=num1*num2;
		return c;
	}
	double divide(){
		double c=num1/num2;
		return c;
	}
	
}
public class Calculator{
	public static void main(String[] args){
		Cal c=new Cal();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.multply());
		System.out.println(c.divide());
	}
}