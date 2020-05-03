public class Millionaire {
    public static void main(String[] args){
        int A=1,B=0;
        B=10*30;
        int[] arr=new int[31];
        arr[1]=1;
        for(int i=2;i<=30;i++){
            arr[i]=2*arr[i-1];
            A+=arr[i];
        }
        //A=A;
        System.out.println(B+" "+A);
        //System.out.println(B);
    }
}
