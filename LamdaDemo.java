import java.util.*;
import java.io.*;
interface PerformanceOperation{
    int check(int a);
}
class MyMath{
    public static int checker(PerformanceOperation p, int num){
        return p.check(num);
    }
    PerformanceOperation isOdd(){
        PerformanceOperation po = (a) -> {return a%2;};
        return po;
    }

    PerformanceOperation isPrime(){
        PerformanceOperation po = (a) ->{
            if ( a == 1) return 1;
            else {
                for ( int i=2; i <a/2+1;){
                    if ( (a%i) ==0 ) return 1;
                }
                return 0;
            }
        };
        return po;
    }

    PerformanceOperation isPalindrome(){
        PerformanceOperation po = (a) ->{
            String word = ""+a;
            boolean Palindrome = true;
            for (int i=0; i<(int)word.length()/2; i++){
                if (word.charAt(i) != (word.length()-1-i)){
                    Palindrome = false;
                    break;
                }
            }
            return Palindrome?0:1;
        };
        return po;
    }
}


public class LamdaDemo {
    public static void main(String[] args) throws IOException{
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformanceOperation op;
        int ret = 0;
        String ans = null;
        while(T-->0){
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch== 1){
                op = ob.isOdd();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"ODD" : "EVEN";
            }
            else if (ch==2) {
                op = ob.isPrime();
                ret= ob.checker(op,num);
                ans= (ret ==0)? "PRIME":"COMPOSITE";
            }
            else if (ch==3) {
                op = ob.isPalindrome();
                ret = ob.checker(op,num);
                ans = (ret == 0)? "PALINDROME" : "PALINDROME";
            }
            System.out.println(ans);
        }

    }
}
