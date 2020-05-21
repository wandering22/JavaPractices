import java.util.Scanner;

public class PointsOfCredit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];//学分
            double sum1=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum1+=arr[i];
            }
            int[] arr2=new int[n];//得分
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            double[] arr3=new double[n];//绩点
            for(int i=0;i<n;i++){
                if(arr2[i]<=100&&arr2[i]>=90){
                    arr3[i]=4.0;
                }else if(arr2[i]<=89&&arr2[i]>=85){
                    arr3[i]=3.7;
                }else if(arr2[i]<=84&&arr2[i]>=82){
                    arr3[i]=3.3;
                }else if(arr2[i]<=81&&arr2[i]>=78){
                    arr3[i]=3.0;
                }else if(arr2[i]<=77&&arr2[i]>=75){
                    arr3[i]=2.7;
                }else if(arr2[i]<=74&&arr2[i]>=72){
                    arr3[i]=2.3;
                }else if(arr2[i]<=71&&arr2[i]>=68){
                    arr3[i]=2.0;
                }else if(arr2[i]<=67&&arr2[i]>=64){
                    arr3[i]=1.5;
                }else if(arr2[i]<=63&&arr2[i]>=60){
                    arr3[i]=1.0;
                }else{
                    arr3[i]=0;
                }
            }
            double[] arr4=new double[n];//学科绩点
            double sum=0;
            for(int i=0;i<n;i++){
                arr4[i]=arr3[i]*arr[i];
                sum+=arr4[i];
            }

            double GPA=0;
            GPA=sum/sum1;
            System.out.printf("%.2f",GPA);
        }
    }
}
