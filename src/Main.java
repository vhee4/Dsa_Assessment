import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1,5,8,6,4,44,2,8};
        List<String> list = new ArrayList<>();
        list.add("actors");
        list.add("costar");
        list.add("altered");
        list.add("related");
        list.add("Goat");
        list.add("tag");

        FindPairs.findPairs(arrayOfNumbers,10);
        KthSmallestNumber.kthSmallestNumber(arrayOfNumbers,9);
        GroupAnagrams.printGroupAnagrams(list);
    }
}