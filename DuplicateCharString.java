import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharString {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        //Converting String to chars
        char[] chars = str.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        //logic --> Characters are inserted as keys and the respective count inserted as Values.
        //If map already contains characters the increase the value by 1.

        for (Character ch: chars) {
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+ 1);
            }
            else {
                charMap.put(ch, 1);
            }

        }

        //loops through only keys

        Set<Character> keys = charMap.keySet();
        for (Character ch: keys) {
            if (charMap.get(ch) >1){
                System.out.println("Character "+ch+" repeating "+ charMap.get(ch) + " times");
            }
        }
    }
}
