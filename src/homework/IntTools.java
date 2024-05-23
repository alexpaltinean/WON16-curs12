package homework;

import java.util.ArrayList;
import java.util.List;

public class IntTools {
    private final int number;

    public IntTools(int number) {
        this.number = number;
    }

    public long digitSum() {
        long digitSum = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            digitSum += tempNumber % 10;
            tempNumber /= 10;
        }
        return digitSum;
    }

    public byte digitAt(int position) {
        String stringNumber = String.valueOf(Math.abs(number));
        if (position < 0 || position > stringNumber.length() - 1) {
            throw new RuntimeException();
        }
        char c = stringNumber.charAt(position);
        int numericValue = Character.getNumericValue(c);
        return (byte) numericValue;
    }

    public int digitAt2(int position) {
        List<Integer> digits = new ArrayList<>();
        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            digits.addFirst(tempNumber % 10);
            tempNumber /= 10;
        }
        if (position < 0 || position > digits.size() - 1) {
            throw new RuntimeException();
        }
        return digits.get(position);
    }

    public static void main(String[] args) {
        IntTools intTools = new IntTools(-3456);
        System.out.println(intTools.digitAt(2));
    }


}
