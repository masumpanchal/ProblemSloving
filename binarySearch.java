public class binarySearch {
    public static void main(String[] args){
       int[] a = {2, 5, 7, 8, 9, 10, 11, 12, 17, 18, 19, 20};
       int scrh = 12;
       int li = 0;
       int hi = a.length-1;
       int mi = (li+hi)/2;

       while (li <= hi){
           if (a[mi] == scrh){
               System.out.println( "Search number is on " + mi+ " th index");
               break;
           }
           else if (a[mi] < scrh){
               li = mi+1;
           }
           else {
               hi = mi - 1;
           }
           mi = (li+hi)/2;
       }
       if (li>hi){
           System.out.println("element not found");
       }
    }
}
