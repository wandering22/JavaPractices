import java.util.Arrays;
public class binarySearch{
	public static int binarySearch(int[] a,int value){
		int left=0;
		int right=a.length-1;
		while(left<=right){
		// for(int i=0;i<=a.length/2;i++){
			int mid=(left+right)/2;
		    if(value==a[mid]){
		       return mid;
		    }else if(value<a[mid]){
				right=mid-1;
			   
		    }else if(value>a[mid]){
			    left=mid+1;
		}
		}		
		
		return -1;
	}
	public static void main(String[] args){
	 	int[] arr={2,3,4,5,7,9,};
		int ret=0;
	    ret=binarySearch(arr,7);
		if(ret==-1){
			System.out.println("找不到");}else
			System.out.println("它的下标是"+ret);
		//System.out.println(Arrays.toString(arr));
	}
}