public class StringRotation {

    public static void main(String[] args) {

        String a = "ABC";
        String b = "BCA";

        boolean result =
                a.length() == b.length()
                        && (a + a).contains(b);

        System.out.println(result);
    }
}
