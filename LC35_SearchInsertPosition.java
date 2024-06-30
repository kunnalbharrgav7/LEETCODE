public class LC35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {3 , 7 , 15 , 38 , 40 , 51 , 79 , 87};
        int target = 30;
        System.out.println(SearchPosition(array, target));
    }

    public static int SearchPosition(int[] array , int target){
        int start_array = 0;
        int end_array = array.length - 1 ;

        while (start_array <= end_array) {
            int mid_array = start_array + (end_array - start_array) / 2;
            if (array[mid_array] == target) {
                return mid_array;
            }
            else if (array[mid_array] < target) {
                start_array = mid_array + 1;
            }
            else if (array[mid_array] > target) {
                end_array = mid_array - 1;
            }    
        }
        return start_array;
    }
}

