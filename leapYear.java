import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        if (year%400 == 0 || year% 4 ==0 && year % 100 != 0){
            System.out.println("Is a Leap Year");
        }
        else {
            System.out.println("Is not a Leap Year");
        }
    }
}
