public class pp14{
	public static void main(String[] args){
		int year;
		boolean isLeapYear=true;
		for(year=1000;year<=2000;year++){
			if(year%400==0||year%4==0&&year%100!=0){
		isLeapYear=true;
		}
			else{
				isLeapYear=false;
			}
			if(isLeapYear)
				System.out.println(year);
		
		}
	}
}
		