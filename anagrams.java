import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String Named a :");
        String a = sc.next();

        System.out.println("Enter String Named b :");
        String b = sc.next();
        sc.close();

        boolean ret = isAnagram(a,b);

        System.out.print("Entered Strings are ");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    static boolean isAnagram(String a, String b){
        // removing white space
        // removing case-sensitive
        a= a.replace(" ","").toLowerCase();
        b= b.replace(" ","").toLowerCase();

        //Converting Char into array
        char c[] = a.toCharArray();
        char d[] = b.toCharArray();

        //for sorting arrays
        Arrays.sort(c);
        Arrays.sort(d);

        if (Arrays.equals(c,d))
            return true;
        else
            return false;

    }
}

