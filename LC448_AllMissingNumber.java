import java.util.ArrayList;
import java.util.List;

public class LC448_AllMissingNumber {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(allMissingNumbers(array));
    }   
    
    public static List<Integer> allMissingNumbers(int[] array){
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                // int temp = array[index];
                // array[index] = array[correctIndex];
                // array[correctIndex] = temp;
                int temp = array[correctIndex];
                array[correctIndex] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index+1) {
                answer.add(index+1);
            }
        }
        return answer;
    }
}
