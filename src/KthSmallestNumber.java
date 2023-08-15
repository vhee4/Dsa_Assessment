import java.util.Arrays;

public class KthSmallestNumber {
    /**
     * Given an integer array, find k'th smallest element in the array where k is a positive integer less than or equal to the length of array.
     * For example,
     * Input: arr = [7, 4, 6, 3, 9, 1] k = 3
     * Output:
     * k’th smallest array element is 4
     * <p>
     * take in an array as the method parameter
     * re-arrange the array in ascending order
     * loop through the array
     **/

    public static void kthSmallestNumber(int[] numbers, int position) {
        if (position < 1 || position > numbers.length) {
            System.out.println("Position not available");
            return;
        }
        Arrays.sort(numbers);
        if (position == 1) {
            System.out.println("The " + position + "st smallest number is " + numbers[position - 1]);
        } else if (position == 2) {
            System.out.println("The " + position + "nd smallest number is " + numbers[position - 1]);
        } else if (position == 3) {
            System.out.println("The " + position + "rd smallest number is " + numbers[position - 1]);
        } else {
            System.out.println("The " + position + "th smallest number is " + numbers[position - 1]);

        }
    }
}
