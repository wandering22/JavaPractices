import java.util.Scanner;

public class GetTotalCount {
    public static int getTotalCount(int month){
        //anner scanner=new Scanner(System.in);
        if(month<3)
            return 1;

        int old = 1;
        int young = 1;
        int month1 = 1;
        int month2 = 0;
        for(int j = 4; j <= month; j++){
            //第一步，第二个月的变成了有生育能力的兔子
            old += month2;
            //第二步，一个月大的兔子变成了两个月大的兔子
            month2 = month1;
            //第三步，有生育能力的兔子生出了一个月大的小兔子
            month1 = old;
            //当月小兔子的个数
            young = month1 + month2;

        }
        return old + young;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(getTotalCount(input));

        }
    }
}

