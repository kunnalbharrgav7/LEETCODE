public class LC189_RotatedArray {
    public static void main(String[] args) {
        
    }

    public static void rotateArray(int[] nums , int k){
        k = k % nums.length;
        reverseArray(nums, 0, nums.length);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length);
    }

    public static void reverseArray(int[] nums , int start , int end){
        while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;            
        }
    }
}
