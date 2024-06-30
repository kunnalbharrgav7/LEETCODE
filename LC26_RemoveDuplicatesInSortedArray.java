public class LC26_RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // System.out.println(RemoveDuplicates(nums));
        for(int i = 1; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        
        int duplicate = RemoveDuplicates(nums);
        System.out.println();
        
        for(int i = 1; i < duplicate; i++){
            System.out.print(nums[i] + " ");
        }

       
    }

    public static int RemoveDuplicates(int[] nums){
        int duplicate = 0;
        for(int i=1; i < nums.length; i++){
            if (nums[duplicate] != nums[i]) {
                duplicate++;
                nums[duplicate] = nums[i];
            }
        }
        return duplicate + 1;
    }
}
