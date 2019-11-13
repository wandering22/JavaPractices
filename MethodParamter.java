import java.util.Arrays;
public class MethodParamter{
	public static void swap(int[] a,int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void main(String[] args){
		int[] a={100,200};
		swap(a,0,1);
		System.out.println(Arrays.toString(a));
	}
}	
		