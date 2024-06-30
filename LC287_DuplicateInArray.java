/**
 * LC287_DuplicateInArray
 */
public class LC287_DuplicateInArray {

    public static void main(String[] args) {
        int[] array = {4,5,1,1,2};
        System.out.println(searchDuplicate(array));
    }

    public static int searchDuplicate(int[] array ){
        int index = 0;
        while (index < array.length) {
            if (array[index] != index + 1) {
                int correctIndex = array[index] - 1;
                if (array[index] != array[correctIndex]) {
                    int temp = array[correctIndex];
                    array[correctIndex] = array[index];
                    array[index] = temp;
                }
                else{
                    return array[index];
                }
            }else{
                index++;
            }
        }
        return -1;
    }
}