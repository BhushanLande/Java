package logicalProgram;

import java.util.*;

public class CollectionPrograms {
    public static void main(String [] args){
        Integer [] array = {321,67,67,54,43,6,67,32,54};

        ArrayList<Integer> arrray = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrray);

        TreeSet sett = new TreeSet<>(Arrays.asList(array));
        System.out.println(sett);

        HashSet hashset = new HashSet(Arrays.asList(array));
        System.out.println(hashset);

        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(array));
        System.out.println(linkedHashSet);
        findDuplicates(arrray);

        reverseTheArray(arrray);

    }
    public static void  findDuplicates(ArrayList list){
        HashSet unique = new HashSet<>();
        HashSet duplicates = new HashSet<>();
        for(int i=0; i<list.size(); i++){
            if(!unique.add(list.get(i))){
                duplicates.add(list.get(i));
            }
        }
        System.out.println("Duplicates in list are:"+ duplicates);
    }
    public static void reverseTheArray(ArrayList list){
        Collections.reverse(list);
        System.out.println("Reversed collection: "+list);
    }
}
