public class pp21{
	public static int plus(int n){
		int sum=0;
		if(n==1)
			return 1;
		else{
		sum+=plus(n-1)+n;
		}
		return sum;
	}
	public static void main(String[] args){
		int n=10;
		int ret=plus(10);
		System.out.println(ret);
	}
}
