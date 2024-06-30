import java.util.Arrays;

public class LC1929_ConcatenationArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        concatenation(array);
        System.out.println(Arrays.toString(concatenation(array)));
    }   
    
    public static int[] concatenation(int[] array){
        int answer[] = new int[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = array[i];
        }
        int index = array.length;
        for (int i = 0; i < array.length; i++) {
            answer[index] = array[i];
            index++;
        }
        return answer;
        // int answer[] = new int[2 * array.length];
        // for (int i = 0; i < array.length; i++) {
        //     answer[i] = array[i];
        // }
        // int index = array.length;
        // for (int i = 0; i < array.length; i++) {
        //     answer[index] = array[i];
        //     index++;
        // }
        // return answer;
    }
}
