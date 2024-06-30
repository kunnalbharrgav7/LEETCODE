import java.util.Arrays;

public class LC27_RemoveElement {
    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        removeElement(array, 2);
        System.out.println(Arrays.toString(removeElement(array, 2)));
    }
    public static int removeElement(int[] array , int value){
        int length = array.length;
        int i = 0;
        while (i < length) {
            if (array[i] == value) {
                array[i] = array[length - 1];
                length--;
            }
            else{
                i++;
            }
        } 
        return length;
    }
}
