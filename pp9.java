public class pp9{
	public static void main(String[] args){
		int num = 1;
		int sum = 0; 
		while(num<=5){
			int i=1;
			int j=1;
			while(i<=num){
				j*=i;
			
			System.out.println(i+"的阶乘是"+j);
			i++;}
			sum+=j;
			num++;
			
		}
		System.out.println("结果是"+sum);
	}
}