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

        findSmallestAndLargestNum(arrray);

        useIterator(arrray);

        removeDuplicates(arrray);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        findCommonsInList(list1, list2);

        findUniquesInList(list1, list2);
    }

    public static void removeDuplicates(ArrayList list){
        TreeSet<Integer> values = new TreeSet<>(list);
        System.out.println(values);
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
    public static void findSmallestAndLargestNum(ArrayList list){
        System.out.println("Smallest num from list is: "+Collections.min(list));
        System.out.println("Largest num from list is: "+Collections.max(list));
    }
    public static void useIterator(ArrayList list){
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void findCommonsInList(List list1, List list2){
        Set<Integer> set = new HashSet<>(list2);
        set.retainAll(list1);
        System.out.println("Common values are: "+set);
    }

    public static void findUniquesInList(List list1, List list2){
        Set<Integer> set = new HashSet<>(list2);
        set.removeAll(list1);
        System.out.println("Unique values are: "+set);
    }


}
