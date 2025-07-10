package logicalProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class WordLength {
    public static void main(String [] args) {

        String input = "Bhushan is an engineer";
        String [] wordArray =  input.split(" ");

        Arrays.sort(wordArray, (a,b) -> b.length() - a.length());
        System.out.println("First longest word: " + wordArray[0]+" and length is: "+wordArray[0].length());
        System.out.println("Second longest word: " + wordArray[1]+" and length is: "+wordArray[1].length());
        System.out.println("Smallest longest word: " + wordArray[wordArray.length-1]+" and length is: "+wordArray[wordArray.length-1].length());

        HashMap<String, Integer> map = new HashMap<>();

        for(String s: wordArray){
            map.put(s,s.length());
        }
        String word = "";
        int maxLength = 0;

        // Iterate through each word to find the longest
        for (String w : wordArray) {
            if (w.length() > maxLength) {
                word = w;
                maxLength = word.length();
            }
        }
        System.out.println(word+" has length: "+maxLength);

        // Using HashMap
        for(Map.Entry<String, Integer> a: map.entrySet())
        {
            if(a.getValue()>maxLength){
                word = a.getKey();
                maxLength = a.getValue();
            }
        }
        System.out.println(word+" has length: "+maxLength);

    }
}
