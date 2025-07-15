package logicalProgram;

import java.util.HashMap;
import java.util.Map;

public class FindTopperAndDropper {
    public static void main(String [] args){
        HashMap<String, Integer>  marks = new HashMap<>();
        marks.put("SS", 97);
        marks.put("NN", 95);
        marks.put("DD", 79);
        marks.put("KK", 78);

//        int mark = Integer.MIN_VALUE ;  // for Highest number ranker
        int mark = Integer.MAX_VALUE; // Start with the highest possible value

        String name = "";
        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            if(mark > entry.getValue()){
                mark = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(mark+" - "+name);
    }
}
