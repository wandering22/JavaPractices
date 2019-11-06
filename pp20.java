public class pp20{
	public static int jiecheng(int n){
		int result=1;
		
		if(n==1){
			return 1;
			}
		else
		result=n*jiecheng(n-1);
			return result;
	}public static void main(String[] args){
		
		int j=1;
		int sum=0;
		for(j=1;j<=10;j++){
			
			sum+=jiecheng(j);
		}
		System.out.println(sum);
	
	}
}