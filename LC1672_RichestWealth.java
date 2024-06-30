public class LC1672_RichestWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {12,2,3},
            {2,1,8},
            {3,7,5},
            {1,6,8}
        };
        System.out.println(Richest(arr));
    }

    public static int Richest(int[][] arr ){
        int result = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                sum = sum + arr[person][account];
            }
                if (sum > result) {
                    result = sum;
                }
        }
        return result;
    }
}
