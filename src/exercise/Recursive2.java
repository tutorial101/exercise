package exercise;

public class Recursive2 {
    
    public void reversePrint(int[] nums) {
        _reversePrint0(nums);
    }
    
    private void _reversePrint0(int[] nums) {
        _reversePrint1(nums);
        System.out.println(nums[0]);
    }
    private void _reversePrint1(int[] nums) {
        _reversePrint2(nums);
        System.out.println(nums[1]);
    }
    private void _reversePrint2(int[] nums) {
        _reversePrint3(nums);
        System.out.println(nums[2]);
    }
    private void _reversePrint3(int[] nums) {
        _reversePrint4(nums);
        System.out.println(nums[3]);
    }
    private void _reversePrint4(int[] nums) {
        //_reversePrint5(nums);
        System.out.println(nums[4]);
    }

    /***
    public void reversePrint(int[] nums) {
        _reversePrint(nums, 0);
    }
    
    private void _reversePrint(int[] nums, int index) {
        if (index < nums.length - 1) {
            _reversePrint(nums, index+1);
        }
        System.out.println(nums[index]);
    }
    ***/

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        new Recursive2().reversePrint(nums);
    }


}
