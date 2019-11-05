public class pp18{
	// public static void printnumber(int n){
		// if(n>=10){
			 // printnumber(n/10);
		// }
		
			// System.out.println(n%10+" ");
	// }
			// public static int plusnumber(int n){
				// if(n<10){
					// return n;
				// }
				// else{
					// return n%10+plusnumber(n/10);
				// }
			// }
			public static void hanoi(int n,int from,int to){
				if(n==1){
					System.out.println("从"+from+"移动到"+to);
				}
				else{
					int other=3-from-to;
					hanoi(n-1,from,other);
					System.out.println("从"+from+"移动到"+to);
				hanoi(n-1,other,to);}
			}
			
	public static void main(String[] args){
		//int n=1234;
		// printnumber(n);
		//System.out.println(ret);
		hanoi(4,0,2);
	}
			}