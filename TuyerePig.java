public class TuyerePig {
    public int calculateMax(int[] prices) {

        int sum = 0;
        for(int i=1;i<prices.length;i++){
            int temp = getmax(prices,0,i)+getmax(prices,i,prices.length-1);
            if(temp>sum)
                sum = temp;
        }
        return sum;
    }
    public static int getmax(int [] prices ,int start ,int end ) {
        int max = 0;
        int min = prices[start];
        for(int i=start+1;i<=end;i++) {
            if (prices[i]-min>max)
                max = prices[i]-min;
            if (prices[i]<min)
                min = prices[i];
        }
        return max ;
    }
}
