public class LC153_MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(SearchInRotatedArray(array));
    }

    public static int SearchInRotatedArray(int[] array ){
            int start = 0;
            int end = array.length - 1;
            // while (start <= end) {
            //     int mid = start + (end - start) / 2;
            //     // if (mid < end && array[mid] > array[mid + 1]) {
            //     if (array[mid] > array[mid + 1]) {
                
            //         return mid + 1;
            //     }
            //     // if (mid > start && array[mid] < array[mid - 1]) {
            //     if (array[mid] < array[mid - 1]) {
            //         return mid;
            //     }
            //     if (array[mid] <= array[start]) {
            //         start = mid + 1;                
            //     }
            //     else {
            //         end = mid - 1;
            //     }
            // } 
            
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (array[mid] > array[end]) {
                    start = mid + 1;
                }
                else{
                    end = mid;
                }
            }
            return array[end];
        }
    }

