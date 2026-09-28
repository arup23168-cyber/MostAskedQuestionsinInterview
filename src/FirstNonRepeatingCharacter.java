import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "Swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toLowerCase().toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}