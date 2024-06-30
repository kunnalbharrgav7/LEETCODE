/**
 * LC540_SingleElementInSortedArray
 */
public class LC540_SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(array));
    }

    public static int singleElement(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == array[mid + 1]) {
                mid = mid - 1;
            }

            int leftpartlength = (mid - start) + 1;
            
            if (leftpartlength % 2 == 0) {
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
        return array[start];
    }
}