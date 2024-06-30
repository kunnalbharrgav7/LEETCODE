import java.util.Arrays;

public class LC977_SquareOfASortedArray {
    public static void main(String[] args) {
     int[] array = {-4,-1,0,3,10};
     System.out.println(Arrays.toString(squareArray(array)));   
    }

    public static int[] squareArray(int[] array){
        int result[] = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int i = result.length - 1; i >= 0 ; i--) {
            int left_square = array[left] * array[left];
            int right_square = array[right] * array[right];
            if (left_square > right_square) {
                result[i] = left_square;
                left++;
            }
            else{
                result[i] = right_square;
                right--;
            }
        }
        return result;
    }
}
