import java.util.Stack;

public class ExchangeAB {
    public int[] exchangeAB(int[] AB) {
        // write code here
        /*Stack<Integer> st=new Stack<>();
        st.push(AB[0]);
        st.push(AB[1]);
        AB[0]=st.pop();
        AB[1]=st.pop();
        return AB;*/

        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        AB[1]=AB[0]+AB[1];
        return AB;
        
//        AB[0] = AB[0]^AB[1];
//        AB[1] = AB[0]^AB[1];
//        AB[0] = AB[0]^AB[1];
//        return AB;
    }

}
