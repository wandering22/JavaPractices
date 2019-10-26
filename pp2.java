public class pp2{
public static void main(String[] args){
	int minint=Integer.MIN_VALUE;
	int maxint=Integer.MAX_VALUE;
	byte minbyte=Byte.MIN_VALUE;
	byte maxbyte=Byte.MAX_VALUE;
    short minshort=Short.MIN_VALUE;
    long minlong=Long.MIN_VALUE;
    short maxshort=Short.MAX_VALUE;
    long maxlong=Long.MAX_VALUE;
	
	int minint1=minint-1;
	int minint2=minint+1;
	short minshort1=(short)(minshort-1);
	short minshort2=(short)(minshort+1);
    System.out.println(minint);
	//System.out.println(maxint);
	//System.out.println(minbyte);
	//System.out.println(maxbyte);
    System.out.println(minshort);
	//System.out.println(maxshort);
	//System.out.println(minlong);
	//System.out.println(maxlong);
	System.out.println(minint1);
	System.out.println(minint2);
	System.out.println(minshort1);
	System.out.println(minshort2);
	
	short ashort=0B010;
		System.out.println(ashort);
		long along=0b010L;
	System.out.println(along);	
	
}
}