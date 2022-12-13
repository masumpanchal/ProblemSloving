import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("Enter Number for upto which Fibonacci series to print:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(fibonacci1(i) + " ");
        }
    }

    //Fibonacci number using recursion.
    /*public static int fibonacci1(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci1(number-1) + fibonacci1(number-2);
    }*/

    //Fibonacci number using loop or Iteration.

    public static int fibonacci1(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for (int i=3; i <= number; i++){
            fibonacci= fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;

        }
        return fibonacci;
    }
}