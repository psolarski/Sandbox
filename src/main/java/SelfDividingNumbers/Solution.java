package SelfDividingNumbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> retList = new LinkedList<>();
        while (left <= right) {
            if (left >= 10) {
                int input = left, unit = 0;
                boolean isEven = true;
                while (input != 0) {
                    unit = input % 10;
                    input = input / 10;
                    if(unit == 0 || left % unit != 0) {
                        isEven = false;
                        break;
                    }
                }
                if(isEven) retList.add(left);
            } else{
                retList.add(left);
            }
            left++;
        }
        return retList;
    }

    public static void main(String[] args){
        int left = 5, right = 15233;
        selfDividingNumbers(left, right).forEach(System.out::println);
    }
}
