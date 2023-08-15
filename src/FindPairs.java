import java.util.*;

public class FindPairs {
    /**
     * Given an unsorted integer array, find a pair with the given sum in it.
     * For example,
     * Input:numbers = [8, 7, 2, 5, 3, 1]
     * target = 10
     * Output: Pair found (8, 2)
     * Or
     * Pair found (7, 3)
     * Input:
     * numbers = [5, 2, 6, 8, 1, 9]
     * target = 12
     * Output: Pair not found
     **/
    public static void findPairs(int[] nums, int target) {
        Map<Integer, List<Integer>> numIndexMap = new HashMap<>();
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                List<Integer> complementIndices = numIndexMap.get(complement);
                for (int index : complementIndices) {
                    pairs.add("(" + nums[i] + ", " + nums[index] + ")");
                }
            }

            numIndexMap.putIfAbsent(nums[i], new ArrayList<>());
            numIndexMap.get(nums[i]).add(i);
        }

        if (pairs.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            System.out.println("Pairs found: " + pairs);
        }
    }


}
