public class pp13{
	public static void main(String[] args){
		int i=0;
		int n=0;

		for(n=1;n<=100;n++){
			for(i=2;i<=n-2;i++){
				if(n%i==0){
				break;
				}
            }
        
          if(i>n-2){
	      System.out.println(n);
		}
		} 
    }
}