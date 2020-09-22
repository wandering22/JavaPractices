import java.util.ArrayList;
import java.util.List;

public class GetABA {
    public int getABA (int number) {
        // write code here
        boolean flag1=false,flag2=false;
        int n1=number;
        int n2=number;
        int a=0,b=0;
        while(flag1!=true){
            n1+=1;
            a++;
            flag1=judge(n1);
        }
        while(flag2!=true){
            n2-=1;
            b++;
            flag2=judge(n2);
        }
        if(a<b){
            return n1;
        }else if(a==b)
            return n2;
        return n2;
    }

    public boolean judge(int n){
        List<Integer> list =new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n=n/10;
        }
        for(int i=0;i<(list.size()/2);i++){
            if(list.get(i)!=list.get(list.size()-1-i))
                return false;

        }
        return true;
    }
}
