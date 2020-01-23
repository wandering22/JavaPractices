import java.util.Stack;
//平衡字符串
public class BalanceString1 {

    public static int spilt(String s){

        Stack<Character> st=new Stack<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
                char cur=s.charAt(i);
             // char top = st.pop();
            if(st.isEmpty()){

                st.push(cur);
              //  break;
            }else if(cur==st.peek()){
                st.push(cur);

            }else{
                st.pop();                 //出栈
                if(st.isEmpty()){
                    count++;
                        }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int ret=spilt("LLLRRR");
        int ret2=spilt("LLRRLR");
        System.out.println(ret);
        System.out.println(ret2);
    }
}
