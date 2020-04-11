public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)!='('&&A.charAt(i)!=')'){
                return false;
            }
            else if(A.charAt(i)=='('){
                count1++;
            }
            else if(A.charAt(i)==')'){
                count2++;
            }

        }
        if(count1!=count2){
            return false;
        }
        return true;
    }
}
