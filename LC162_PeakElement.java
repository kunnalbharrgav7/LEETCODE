package LEETCODE;

public class LC162_PeakElement {
    public static void main(String[] args) {
        int[] array = {2 , 5 , 8 , 15 , 27 , 29 , 23 , 11 , 4 };
    }

    public static int SearchMountainArray(int[] array){
        int start_array = 0;
        int end_array = array.length - 1;
        
        while(start_array < end_array){
            int mid_array = start_array + (end_array - start_array) / 2;
            if(array[mid_array] < array[mid_array + 1]){
                start_array = mid_array + 1;
            }
            else{
                end_array = mid_array;
            }
        }
        // return start_array;
        return end_array; //because at last start and end will be pointing to the same number
    }
}
