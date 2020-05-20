import java.util.Scanner;

public class XiaoYiUpgrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int [n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(m>arr[i])
                {
                    m+=arr[i];
                }
                else
                {
                    m+=commonDivisor(m,arr[i]);
                }
            }
            System.out.println(""+m);
        }
    }

    public static int commonDivisor(int n,int m)
    {
        if(m%n==0)
            return n;
        else
        {
            return commonDivisor(m%n,n);
        }

    }
}
