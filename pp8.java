public class pp8{
	public static void main(String[] args){
		/*int n=Integer.parseInt(args[0]);
		if (n%2!=0){
			System.out.println("是奇数");
		}else{
			System.out.println("是偶数"）;
		}*/
		/*int year=Integer.parseInt(args[0]);
		boolean isLeapYear=true;
		if(year%400==0||year%4==0&&year%100!=0){
		isLeapYear=true;}
			else{
				isLeapYear=false;
			}
			if(isLeapYear)
		System.out.println(year+"年是闰年");
		else{
			System.out.println(year+"年是平年");
		}*/
		int today=Integer.parseInt(args[0]);
		switch(today){
			case 1:
			System.out.println("星期一");
			break;
			case 2:
			System.out.println("星期二");
			break;
			case 3:
			System.out.println("星期三");
			break;
			case 4:
			System.out.println("星期四");
			break;
			case 5:
			System.out.println("星期五");
			break;
			case 6:
			System.out.println("星期六");
			break;
			case 7:
			System.out.println("星期天");
			break;
			default:
			System.out.println("不认识的参数");
			break;
		}
	}
}