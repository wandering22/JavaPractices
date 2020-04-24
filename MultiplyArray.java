public class MultiplyArray {
    public int[] multiply(int[] A) {

        int n=A.length;
        int[] B=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                B[i]=(product(A,1,n-1));
            }else if(i==n-1){
                B[i]=(product(A,0,n-2));
            }else
                B[i]=(product(A,0,i-1)*product(A,i+1,n-1));
        }
        return B;
    }
    public static int product(int[] C,int left,int right){
        //if(C[left]==C[right]-1){
        //  return C[left]*C[right];
        //}
        //else
        //  return product(C,left,right-1);
        int ret=C[right];
        while(right!=left){
            ret=ret*C[(right-1)];
            right-=1;
        }
        return ret;
    }
}
