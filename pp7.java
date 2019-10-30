public class pp7{
	public static void main(String[] args){
		int a=20;
		int b=10;
		int c=30;
		int tmp=0;
		for(int i=0;i<3;i++)
		{
			if(a<b){
		        tmp=a;
		        a=b;
		        b=tmp;	
			}
			if(b<c){
				tmp=b;
			    b=c;
			    c=tmp;
			}
		}
		System.out.println("max="+a+"\nmin="+c);
		}
	}