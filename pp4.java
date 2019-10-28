public class pp4{
    public static void main(String[] args){
		int add=0;
		int j=0;
		for(int i = 0; i < args.length; i++){
			
		 add+=Integer.parseInt(args[i]);
		 
		j++;
		
		}
		double c=add/j;
		System.out.println(c);
	}
}
	