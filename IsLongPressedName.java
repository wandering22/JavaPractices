public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        //     for(int i=0;i<name.length();i++){
        //         int number=1;
        //         for(int ii=i;ii<name.length()-1;ii++){
        //         if(name.charAt(ii+1)==name.charAt(ii)){
        //             number++;
        //         }}
        //         int number2=1;
        //         for(int j=0;j<typed.length();j++){
        //             if(name.charAt(i)==typed.charAt(j)){
        //                 for(int jj=j;jj<name.length()-1;jj++){
        //                 if(typed.charAt(jj+1)==typed.charAt(jj)){
        //                     number2++;
        //                 }}
        //             }
        //         }
        //         if(number<=number2){
        //             return true;
        //         }
        //     }
        //     return false;
        int len1 = name.length();
        int len2 = typed.length();
        if(len1>len2){
            return false;
        }
        int i=0;
        int j=0;
        while(i<len1&&j<len2){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i ==len1;
    }
}
