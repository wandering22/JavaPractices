public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i --) {
            if(digits[i] != 9) {
                digits[i] ++;
                return digits;
            }

            digits[i] = 0;
        }
         //跳出循环 说明数字全是9
        int[] nDigits = new int[digits.length + 1];
        nDigits[0] = 1;
        return nDigits;
    }
}
