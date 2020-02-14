public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        int l=S.length()-1;
        char[] c=S.toCharArray();
        for(int i=0;i<l;i++,l--){
            while(i<l){if(('a'<=c[i]&&c[i]<='z')||('A'<=c[i]&&c[i]<='Z')){
                break;
            }
                i++;}
            while(l>i){
                if(('a'<=c[l]&&c[l]<='z')||('A'<=c[l]&&c[l]<='Z')){
                    break;
                }
                l--;}

            char a=c[i];
            c[i]=c[l];
            c[l]=a;

        }
        String nc=new String(c);
        return nc;
    }
}
