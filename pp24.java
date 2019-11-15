 class Change{
	int a=1;
	int b=2;
    //Change(){
		
	public  void change(){
		int tmp=0;
		
		tmp=a;
		a=b;
		b=tmp;
	     
        System.out.println(a);  
        System.out.println(b); 		
	}
}
public class pp24{
	public static void main(String[] args){
		int a=1;
		int b=2;
		Change c=new Change();
		c.change();
		//int c=change.a;
		//int d=change.b;
		//int d=change.b;
		//System.out.println(a);
           	       	
		//change(a,b);
		
	}
	}

	
		  