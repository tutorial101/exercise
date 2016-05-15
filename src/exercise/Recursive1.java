package exercise;

public class Recursive1 {

    public int sum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        return _sum(nums, 0, nums.length - 1);
    }

    private int _sum(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        } else {
            return nums[start] + _sum(nums, start+1, end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int sum = new Recursive1().sum(nums);
        System.out.println(sum);
    }

}
