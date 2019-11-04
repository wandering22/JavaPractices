public class pp17{
	// public static int ding(int n){
		// if(n==1)
			// return 1;
		// else 
			// return ding(n-1)*n;
	// }
	
	
	// public static void main(String[] args){
		// System.out.println(ding(5));
	// }
// }

public static int fibonacci(int n){
	
	if(n<=2)
		return 1;
	else
		return fibonacci(n-1)+fibonacci(n-2);
	
}
public static void main(String[] args){
	for(int i=1;i<=8;i++){
		System.out.println(fibonacci(i));
	}
	
}
}