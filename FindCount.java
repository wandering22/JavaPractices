import java.util.Scanner;

public class FindCount {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[100];
        int i=0;
        while(scanner.hasNextInt()){
            arr[i]=scanner.nextInt();
            i++;
        }
        int count=0;
        for(int n=0;n<=i;n++){
            for(int j=n+1;j<=i;j++){
                if(arr[j]==arr[n]){
                    count++;
                }
            }
            if(count>=(i+1)/2){
                System.out.println(arr[n]);
                break;
            }
        }
    }
}
