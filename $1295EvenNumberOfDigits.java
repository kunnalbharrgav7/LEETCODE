package DSA;

public class $1295EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {42,78,256,8978,33,157};
        // System.out.println(CountEvenNumbers(arr));
        int result = CountEvenNumbers(arr);
        System.out.println("Even number digits present in array is : " + result);
    }

    public static int CountEvenNumbers(int[] arr){
        int count = 0;
        for (int number : arr) {
            if (CheckEvenOrNot(number)) {
            count++;    
            }
        }
        return count;
    }

    public static boolean CheckEvenOrNot(int number){
        int NumberOfDigit = CountDigits(number);
        if(NumberOfDigit % 2 == 0){
        return true;
        }
        return false;
    }


    public static int CountDigits(int number){
        if (number < 0) {
            number = number * -1;
        }
        if (number == 0) {
            return 1;
        }
        int count=0;
        while(number > 0){
        count++;
        number = number / 10;
        }
        return count;
    }
}
