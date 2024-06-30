// package LEETCODE;
public class LC34_FirstLastPosition {
    public static void main(String[] args) {
        int[] num = {1 , 3 , 4 , 4 , 4 , 4 , 4 , 4 , 4 , 25 , 49 , 78 };
        int target = 4;
    }
    public static int[] FirstLastSearch(int[] num , int target){
        int start_array = 0;
        int end_array = num.length - 1;
        int[] result = {-1,-1};
        while (start_array <= end_array) {
            int mid_array = start_array + (end_array - start_array) / 2;
            if (num[mid_array] == target) {
                result[0] = mid_array;
                end_array = mid_array - 1;
            }
            else if (num[mid_array] < target) {
                start_array = mid_array + 1;
            }
            else if (num[mid_array] > target) {
                end_array = mid_array - 1;
            }    
        }
        
        start_array = 0;
        end_array = num.length - 1;
        while (start_array <= end_array) {
            int mid_array = start_array + (end_array - start_array) / 2;
            if (num[mid_array] == target) {
                result[1] = mid_array;
                start_array = mid_array + 1;
            }
            else if (num[mid_array] < target) {
                start_array = mid_array + 1;
            }
            else if (num[mid_array] > target) {
                end_array = mid_array - 1;
            }    
        }
        return result;
    }
}
