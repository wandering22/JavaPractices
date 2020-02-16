public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length <= 1) return A;
        int i=0, j = A.length-1;
        while(i < j) {

            while(i<j && A[i]%2 == 0) i++;
            while(i<j && A[j]%2 == 1) j--;
            if(i >= j) break;
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
