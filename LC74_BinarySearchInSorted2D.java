public class LC74_BinarySearchInSorted2D {
    public static void main(String[] args) {
        int[][] array = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(searchInSorted2D(array, 30));
    }

    public static boolean searchInSorted2D(int[][] array , int target){
        int m = array.length;
        int n = array[0].length;
        int start = 0;
        int end = m*n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid/n][mid%n] < target) {
                start = mid + 1;
            }            
            else if (array[mid/n][mid%n] > target) {
                end = mid - 1;            
            }
            else{
                return true;
            }
        }
        return false;
    }
}
