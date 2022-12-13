public class removingWhiteSpaces {
    public static void main(String[] args){
        String str = " J a v a  S t  ar   ";
        String trimmedstr = str.trim();
        System.out.println("String without trim:"+ str);
        System.out.println("String with trim:" + trimmedstr);
        String StringReplaced = str.replaceAll("\\s", "");
        System.out.println("String with replacedAll: " + StringReplaced);
    }
}

