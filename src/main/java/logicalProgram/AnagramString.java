package logicalProgram;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        if (str1.length() == str2.length()) {
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (Arrays.equals(array1, array2)) {
                System.out.println(Arrays.toString(array1) + " is anagram string: " + Arrays.toString(array2));
            } else {
                System.out.println(str1 + " is not anagram string for: " + str2);
            }
        } else {
            System.out.println(str1 + " is not anagram string for: " + str2);
        }
    }
}