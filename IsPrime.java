import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);
    }


    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;

        if (n ==0 || n ==1){
            System.out.println("Is not prime number");
        }
        else {
            for (i=2; i<=m; i++ ){
                if (n%i == 0){
                    System.out.println("Is not prime number");
                    flag=1;
                    break;
                }
            }
            if (flag ==0 ){
                System.out.println("Is prime number");
            }
        }

    }
}
