import java.util.Arrays;
public class Revolve{
	
	public static int[] spin(int[]a,int n){
		int i=0;
		int[] b={0,0,0,0,0,0,0};
		//int k=a.length-n-1;
			if(n>a.length){
			n=n%a.length;}
			for(int j=n;j<a.length;j++){
			
				b[i]=a[j];
				i++;	
		}
		for(int j=0;j<n;j++){
				b[i]=a[j];
				i++;
			}
		
		return b;
	}
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7};
		int n=18;
		int[] b=spin(a,n);
		System.out.println(Arrays.toString(b));
	}
}
		