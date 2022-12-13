import java.util.*;

public class fristNonReaptedChar {
    public static void main(String[] args) {

        String word = "mmeetzw";
        char[] y = word.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new LinkedHashMap<>();

        int i = 0;
        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldval = map.get(y[i]);
                int newval = oldval + 1;
                map.put(y[i], newval);
            }
            ++i;
        }

        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> ch : hmap) {
            if (ch.getValue() == 1) {
                System.out.println(ch.getKey());
                System.exit(0);
            }
        }
    }
}