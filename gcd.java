import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number to find GCD ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number to find GCD ");
        int b = sc.nextInt();
        int g=0;
        for (int i=1; i<=a; i++){
            if(a%i == 0 && b%i ==0){
                g=i;
            }
        }
        System.out.println("GCD Value is :" + g);
        System.out.println(findGcd(a,b));
    }

    public static int findGcd(int a, int b){
        //base case
        if (b == 0) {
            return a;
        }
        return findGcd(b, a%b);
    }
}
