import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Factorial using recursion in java is F1 :" + F1(num));
        System.out.println("Factorial using iteration in java is F2 :" + F2(num));
    }

    //Factorial using recursion method
    public static int F1(int Number){
        if (Number == 0){
            return 1;
        }
        return Number*F1(Number-1);
    }

    //Factorial using iteration method
    public static int F2(int Number){
        int result = 1;
        while (Number !=0){
            result = result*Number;
            Number--;
        }

        return result;
    }
}

