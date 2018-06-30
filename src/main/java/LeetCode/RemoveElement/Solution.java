package LeetCode.RemoveElement;

public class Solution {

    private static int removeElement(int[] nums, int val) {
        int c = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.print("Length after removal: " + removeElement(nums, val));
    }
}
