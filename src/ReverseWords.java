public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "Hello world";

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(new StringBuilder(word)
                            .reverse())
                    .append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
