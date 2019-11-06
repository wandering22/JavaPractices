import java.util.Arrays;
public class ArrayDemo{
	// public static int[] creatArray(int n){
		// return new int[n];
	// }
		//public static void printArray(int[] a){
			// int size=a.length;
			// for(int i=0;i<a.length;i++){
				// System.out.println(a[i]);
		// }
		// }
		
		public static void max(int[] n){
			//int size=n.length;
			int m=n[0];
			for(int i=0;i<n.length;i++){
				if(n[i]>m){
					m=n[i];
				}
			}
			System.out.println(m);
		}
			
        public static void average(int[] n){
			int size=n.length;
			int m=0;
			int j=0;
			for(int i=0;i<size;i++){
				j+=n[i];
			    m=j/(i+1);
		}
				System.out.println(m);
		}
			
			public static int indexOf(int[] n,int i){
				int size=n.length;
				for(int j=0;j<size;j++){
					if(n[j]==i){
					return j;
					
					
				}
			}
			return -1;
			}
			
            public static int lastindexOf(int[] n,int i){ 
			 for(int j=n.length;j>=0;j--){
				 if(n[j]==i){
					return j;	
					
				}
			}
			return -1;
			}
				
        public static int[] copyRangeOf(int[]a,int from,int to){
			int[] b=new int[to-from];
			for(int i=from;i<to;i++){
				b[i-from]=a[i];
		}return b;
		}
				
		public static void main(String[] args){
			int[] a={1,5, 6, 7, 8,6, 10};
			//creatArray(6);
			
			// printArray(a);
			
			//max(a);
			//average(a);	
			// int i=indexOf(a,6);
			// if(i==-1){
			// System.out.println("找不到");}else
			// System.out.println("它的下标是"+i);
			// int j=lastindexOf(a,6);
			// if(j==-1){
			// System.out.println("找不到");}else
			// System.out.println("它的下标是"+j);
		    int[] m=copyRangeOf(a,2,5);
			System.out.println(Arrays.toString(m));
		}
}