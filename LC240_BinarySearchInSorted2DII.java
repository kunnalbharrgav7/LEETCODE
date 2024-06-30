public class LC240_BinarySearchInSorted2DII {
    public static void main(String[] args) {
        int[][] array = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(searchInSorted2D(array, 30));
    }

    public static boolean searchInSorted2D(int[][] array , int target){
        int m = 0;
        int n = array[0].length - 1;
        while (m < array.length && n >= 0) {
            if (array[m][n] == target) {
                return true;
            }
            if (array[m][n] > target) {
                n--;
            }
            else{
                m++;
            }
        }
        return false;
    }
}
