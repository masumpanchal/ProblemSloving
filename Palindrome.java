import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));


    }
        // Iterative method
    public static boolean isPalindrome(String input){

        if (input == null || input.isEmpty()){
            return true;
        }

        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = input.length() -1; i>=0; i--){
            sb.append(array[i]);
        }
        String reverseOfString = sb.toString();

        return input.equals(reverseOfString);
    }
        //Recursive method
    /* public static void extraMethod(){
        int num = 121;
        int temp = num;
        int rev = 0, rem;

        while (temp != 0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (num==rev){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }*/
}

