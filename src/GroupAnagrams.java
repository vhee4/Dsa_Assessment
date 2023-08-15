import java.util.*;

public class GroupAnagrams {
    /**
     * Given a list of words, efficiently group all anagrams.

     *The two strings, X and Y, are anagrams if by rearranging X's letters, we can get Y using all the original letters of X exactly once. For example, all these pairs are anagrams as lhs can be rearranged to rhs and vice-versa.

     * actors = costar
     * altered = related
     * auctioned = education
     * aspired = despair
     * mastering = streaming
     **/

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramGroups.putIfAbsent(sortedWord, new ArrayList<>());
            anagramGroups.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void printGroupAnagrams(List<String> words){
        List<List<String>> anagramGroups = groupAnagrams(words);
        for (List<String> list1 : anagramGroups) {
            System.out.println(list1);
        }
    }




}
