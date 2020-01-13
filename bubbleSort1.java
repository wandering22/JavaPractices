import java.util.Arrays;
public class bubbleSort1{
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		
	}
	public static void main(String[] args){
		int[] arr={2,5,3,4,8,6,9};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
	