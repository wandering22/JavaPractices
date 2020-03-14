package 比较;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> arr2 = new ArrayList<Integer>();
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right-1){
            mid=(left+right)/2;
            if(arr[mid]<x)
                left=mid;
            else if(arr[mid]>x)
                right=mid;
            else
                break;
        }

        int nearest;
        if(left==right-1){
            if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
                nearest=right;
            }else
                nearest=left;

        }else
            nearest=mid;

        int l=nearest;
        int r=nearest+1;
        for(int i=0;i<k;i++){
            if(l==-1)
                break;
            else if(r==arr.length){
                l=arr.length-k-1;
                break;

            }else{
                if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                    l--;
                } else {
                    r++;
                }
            }
        }
        l++;
        for(int i=l;i<k+l;i++){
            arr2.add(arr[i]);
        }

        return arr2;
    }
}
