package logicalProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateChars {
    public static void main(String [] args){
        String name = "Bhushan Lande";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<name.length(); i++){
            map.put(name.charAt(i), map.getOrDefault(name.charAt(i),0)+1);
        }

        StringBuilder b = new StringBuilder();
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(map.get(ch)==1){
                b.append(ch);
            }
        }
        System.out.println(b); //To print non repeated char only

        for(Character ch :map.keySet()){
            if(map.get(ch)>1){
                System.out.println(ch+" is repeated: "+map.get(ch));
            }
        }
    }
}
