package easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0 || digits == null) {
            return new int[0];
        }

        int carry = 1;
        for (int i = digits.length - 1; i > 0; i--) {
            int sum = digits[digits.length - 1] + 1;
            if (sum > 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            digits[i] = digits[i] % 10;
        }
        if(carry == 1){
            int[] result = new int [digits.length +1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0]=1;
            return result;
        } else{
            return digits;
        }
    }
}
