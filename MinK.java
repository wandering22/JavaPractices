import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinK {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //int [] arr=new int[100];
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        int i=0;
        while(scanner.hasNextInt()){
            // arr[i]=scanner.nextInt();
            list.add(scanner.nextInt());
            i++;
        }
        //arr.length()=i-0;
        int k= list.get(i-1);
        list.remove(i-1);
        while(list2.size()!=k) {
            //int x=0;
            int min=list.get(0);
            int index=0;
            for(int x=0;x<list.size();x++){
                if(list.get(x)<min){
                    min=list.get(x);
                    index=x;
                }
            }

            list2.add(min);
            list.remove(index);
        }
        for (int x = 0; x < list2.size(); x++) {
            System.out.print(list2.get(x)+" ");
        }
    }
}
