public class LC41_FirstMissingPositive {
    public static void main(String[] args) {
        // int[] array = {7,8,9,11,12};
        int[] array = {3,4,-1,1};
        System.out.println(firstPositive(array));
    }

    public static int firstPositive(int[] array){
        int i = 0;
        while (i < array.length) {
            int element = array[i] - 1;
            if (array[i] > 0 && array[i] <= array.length && array[i] != array[element]) {
                int temp = array[element];
                array[element] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index + 1) {
                return index + 1;
            }
        }
        return array.length + 1;
    }
}
