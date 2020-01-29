public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int c=x;
        int b=0;
        while(c!=0){
            int a=c%10;
            b=b*10+a;
            c=c/10;
        }
        return b==x;
    }
}
