import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int input = sc.nextInt();
        int rev = 0, rem;

        while (input != 0){
            rem = input %10;
            rev = rev*10 + rem;
            input = input/10;
        }
        System.out.println(rev);
    }
}
