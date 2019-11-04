public class pp16{
	public static int jiecheng(int n){
		 int result = 1; 
		  for (int i = 1; i <= n; i++) {
			  result *= i;
			  }
			  return result;
			  } 
		
	public static void main(String[] args){
		
		int j=1;
		int sum=0;
		for(j=1;j<=5;j++){
			
			sum+=jiecheng(j);
		}
		System.out.println(sum);
	
	}
},.