import java.util.Arrays;

public class LC645_SetMismatch {
    public static void main(String[] args) {
        int[] array = {1,2,2,4,5,6,6,8};
        findDuplicateMissing(array);
        System.out.println(Arrays.toString(findDuplicateMissing(array)));
    }

    public static int[] findDuplicateMissing(int[] array){
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                int temp = array[correctIndex];
                array[correctIndex] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index+1) {
                return new int[] {array[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
}
