public class rotation {
    public static void main(String[] args) throws Exception {
        String original = "IndiaVsEngland";
        String rotated = "EnglandIndiaVs";
        String newString = original.concat(original);
        if (newString.contains(rotated)){
            System.out.println("Rotational String");
        }
        else {
            System.out.println("Not rotational string");
        }
    }
}
