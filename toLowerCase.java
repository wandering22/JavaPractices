public class toLowerCase {
    public String toLowerCase(String str) {
        String ret="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=65&&c<=90){    //判断大写字母
                c+=32;   //变为小写字母
            }
            ret+=c;
        }
        return ret;
    }
}
