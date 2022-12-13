import java.util.Scanner;

public class reverseStringInPlace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int leng = str.length();
        String rev = "";

        for (int i=leng-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
