public class pp19{
	public static int jiecheng(int n){
		int result=1;
		
		if(n==1){
			return 1;
			
		// for(i=0;i<=n;i++){
		    // result*=i;
		}
		else
		result=n*jiecheng(n-1);
			return result;
	}
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int ret=jiecheng(n);
		System.out.println(ret);
	}
}
		