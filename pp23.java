import java.util.Arrays;
public class pp23{
	public static int[] copyOf(int[] a,int newLength){
		
			int[] dest=new int[newLength];
			//int length=newLength<a.length?newLength:a.length;
			
			dest[i]=a[i];
	        }
			return dest;
	}
	
	public static int[] copyOfRange(int[] a,int from,int to){
		int[] dest = new int[to - from];
		for (int i = from; i < to; i++) {
			dest[i - from] = a[i];
		}	
		return dest;
	}
	}
	
	public static void fill(int[] a,int val({
		for(int i=0;i<a.length;i++){
			a[i]=val;
		}
	}
	
	public static void fill(int[] a,int from,int to,int val){
		for(int i=from;i<a.length;i++){
			a[i]=val;
		}
	}
	
	
	public static void arraycopy(int[] src,int srcPos,int[] dest,int destPos,int length){
		if(src==dest){
			int[] tmparray=Array.copyOfRange(src,scrPos,scrPos+length);
			for (int i = 0; i < length; i++) {
				dest[destPos + i] = tmpArray[i];
			}
		} else {
			for (int i = 0; i < length; i++) {
				dest[destPos + i] = src[srcPos + i];
			}
		}
		
	}
	public static void equals(int[] a,int[] b){
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	}
	
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		int[] ret=copyOf(a,3);
		System.out.println(Arrays.toString(ret));
		
	}
}