package logicalProgram;

import java.util.LinkedHashMap;

public class GetFirstUniqueCharOfString {
    public static void main(String [] args) {
        String str = "Automation";
        String str1 = str.toLowerCase();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
