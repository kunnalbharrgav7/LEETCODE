import java.util.Arrays;

public class LC283_MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        allZeroAtEnd(array);
        System.out.println(Arrays.toString(allZeroAtEnd(array)));
    }
    public static void allZeroAtEnd(int[] array){
        if (array.length == 0 || array.length == 1) {
            return; 
        }
        int nonzero_index = 0;
        int zero_index = 0;
        while (nonzero_index < array.length) {
            if (array[nonzero_index] != 0) {
                int temp = array[nonzero_index];
                array[nonzero_index] = array[zero_index];
                array[zero_index] = temp;
                nonzero_index++;
                zero_index++;
            }else{
                nonzero_index++;
            }
        }
    }
}
