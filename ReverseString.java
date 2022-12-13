import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        //quick ways to reverse String in Java - Use StringBuffer and StringBuilder

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        //-------------------------------------StringBuilder---------------------------------------
        String reverse = new StringBuilder(word).reverse().toString();

        System.out.printf("Original Word is : %s , reverse word is %s %n ", word, reverse);

        //-------------------------------------StringBuffer---------------------------------------
        System.out.println("Enter a second word");
        word = sc.nextLine();
        reverse = new StringBuffer(word).reverse().toString();

        System.out.printf("Original Word is : %s , reverse word is %s %n ", word, reverse);

        //3rd method
        System.out.println("Enter word1");
        String word1= sc.next();
        int leng = word1.length();
        String reverse1= "";

 ;       for (int i=leng-1; i>=0; i--){
            reverse1=reverse1+word1.charAt(i);
        }
        System.out.println(reverse1);

    }
}
