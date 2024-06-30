import java.util.Arrays;

public class LC268_MissingNumber {
    public static void main(String[] args) {
        int[] array = {3,0,1};
        System.out.println(missingNumber(array));
        // System.out.println(Arrays.toString(array));
    }

    public static int missingNumber(int[] array){
        int i = 0;
        while (i < array.length) {
            int element = array[i];
            if (array[i] < array.length && array[i] != array[element]) {
                int temp = array[element];
                array[element] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index) {
                return index;
            }
        }
        return array.length;
    }
}
