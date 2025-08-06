package logicalProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintVowels {
    public static void main(String [] args){
        String bhushan = "bhushan is an engineer f pune";
        String vowels = "";

        for(char ch :bhushan.toCharArray()){
            if(ch=='i'||ch=='o'||ch=='e'||ch=='u'||ch=='a'){
                vowels += ch;
            }
        }

        System.out.println(vowels);
        System.out.println(missingVowel(bhushan));
    }
    public static String missingVowel(String str){
        TreeSet<String> found = new TreeSet<>();
        for(char ch :str.toLowerCase().toCharArray()){
            if(ch=='i'||ch=='o'||ch=='e'||ch=='u'||ch=='a'){
                found.add(String.valueOf(ch));
            }
        }

        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        vowels.removeAll(found);

        StringBuilder missingChars = new StringBuilder();
        if (found.size() < 5) {
            for (String vowel : vowels) {
                missingChars.append(vowel);
            }
            return missingChars.toString();
        } else {
            return "No vowels missing in this string";
        }
    }
}
