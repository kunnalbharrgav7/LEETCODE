// package LEETCODE;
public class LC704_BInarySearch {
    public static void main(String[] args) {
        int[] arr = {14,22,37,41,59,63,75,88};
        int target = 41;
        System.out.println(Search(arr, target) + "th index");
        
    }
        public static int Search(int[] arr, int target) {
            int start_array = 0;
            int end_array = arr.length - 1 ;
    
            while (start_array <= end_array) {
                int mid_array = start_array + (end_array - start_array) / 2;
                if (arr[mid_array] == target) {
                    return mid_array;
                }
                else if (arr[mid_array] < target) {
                    start_array = mid_array + 1;
                }
                else if (arr[mid_array] > target) {
                    end_array = mid_array - 1;
                }    
            }
            return -1;
        }
    }

