import java.util.Scanner;

public class intPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int pali = sc.nextInt();
        if (isPalindrome(pali)){
            System.out.println(pali +" Is a palindrome");
        } else {
            System.out.println(pali + " Is not a palindrome ");
        }
    }

    public static boolean isPalindrome (int number){
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0){
            int reminder = palindrome % 10;
            reverse = reverse * 10 +reminder;
            palindrome = palindrome/10;

            if (number == reverse) {
                return true;
            }
        }
        return false;
    }
}
