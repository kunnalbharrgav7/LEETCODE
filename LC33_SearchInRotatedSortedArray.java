public class LC33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(pivot(array) + " index");
        System.out.println(Search(array, target) + " index");
    }

        public static int Search(int[] array , int target){
            int pivot = pivot(array);

            if (pivot == -1) {
                return BinarySearch(array, target , 0 , array.length - 1);
            }
            if (array[pivot] == target) {
                return pivot;                
            }
            if (target >= array[0]) {
                return BinarySearch(array, target, 0, pivot - 1);
            }
                return BinarySearch(array, target, pivot + 1 , array.length - 1);
        }

        static int BinarySearch(int[] array , int target , int start , int end){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (array[mid] == target) {
                    return mid;
                }
                else if (array[mid] < target) {
                    start = mid + 1;
                }
                else if (array[mid] > target) {
                    end = mid - 1;
                }    
            }
            return -1;
        }

        static int pivot(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1 ;
            }
            if (array[mid] <= array[start]) {
                end = mid - 1;                
            }
            else {
                start = mid + 1;            
            }
        }            
        return -1;
    }
}

