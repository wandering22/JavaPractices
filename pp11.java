public class pp11{
	public static void main(String[] args){
		int age=Integer.parseInt(args[0]);
		if(age<=18){
		System.out.println("当前年龄是少年！");}
		else if(age>18&&age<=28){
			System.out.println("当前年龄是青年！");}
		else if(age>28&&age<=55){
			System.out.println("当前年龄是中年！");}
			else if(age>=56){
			System.out.println("当前年龄是老年！");}
	}
}
		