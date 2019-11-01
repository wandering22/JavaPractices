public class pp12{
	public static void main(String[] args){
	int i=Integer.parseInt(args[0]);
	int j=0;
	for(j=2;j<=i-2;j++){
	if(i%j==0){
		break;
	}}
	if(j<=i-2)
	System.out.println("它不是素数");
	
	else {
	System.out.println("它是素数");}
	}}