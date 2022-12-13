import java.util.Scanner;

//Armstrong number in java if the sum of its own digits raised to the power number of digits gives the numbers itself. for example 0, 1,
// 153, 370, 371, 407, 1634, 8208 and 9474.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int z = n, count = 0, digit, sum = 0, pro;
        while (z > 0) {
            count = count + 1;
            z = z/10;
        }
            z=n;
        while (z > 0) {
            digit = z % 10;
            pro = 1;
            for (int i = 1; i <= count; i++) {
                pro = pro*digit;
            }
                sum = sum+pro;
                z=z/10;
        }
        if (sum==n) {
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }
    }
}