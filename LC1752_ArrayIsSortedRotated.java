public class LC1752_ArrayIsSortedRotated {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(checkSortedRotated(array));
    }

    public static int checkSortedRotated(int[] array){
        int count = 0;
        for(int i = 1; i < array.length; i++){
            if (array[i] > array[i - 1]) {
                count++;                
            }
        }

            if (array[0] > array[array.length-1]) 
                count++;
                return count<=1;
    }
}
