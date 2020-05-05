public class WXGifts {
    public int getValue(int[] gifts, int n) {
        // write code here
        //int count=1;
        for(int i=0;i<n-1;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(gifts[j]==gifts[i]){
                    count++;
                }
                if(count>n/2){
                    return gifts[i];
                }
            }
        }
        return 0;
    }
}
