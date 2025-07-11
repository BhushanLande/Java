package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamFilter {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2, 4, 3, 4,5,5, 5, 8, 34);
        Stream<Integer> s = list.stream();
        String [] ar = {"b","f","d"};
        Stream<String> array = Arrays.stream(ar);

        IntStream range = IntStream.range(1,35);

        HashMap<String, Double> map = new HashMap<>();
        map.put("Sachin", 8.7);
        map.put("Rahul", 7.7);
        map.put("Virat", 8.4);

        //Print players with name having avg more than 8
         map.entrySet().stream().filter(x -> x.getValue()>8).forEach(x -> System.out.println(x.getKey()+" - "+x.getValue()));

        /* ... output
        Sachin - 8.7
        Virat - 8.4
        */
        List<String >str =  map.keySet().stream().filter(x -> x.contains("h")).collect(Collectors.toList());
        System.out.println(str);
        // Output >> [Rahul, Sachin]

        map.entrySet().stream().filter(x-> x.getValue()<8).forEach(x -> System.out.println(x.getValue()));
        // Output >> 7.7

        String str1 = "bhuuuushhhhan";
        ArrayList<Character> ss = new ArrayList<>();

        HashMap <Character, Integer> dup = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            dup.put(str1.charAt(i), dup.getOrDefault(str1.charAt(i),0)+1);
        }

        for(Character c : dup.keySet()){
            if(dup.get(c)>1) {
                System.out.println("This is duplicate "+dup.get(c)+" -- "+c);
            }
        }

        for(int i=0; i<str1.length(); i++){
            char c= str1.charAt(i);
            int count =0;
            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j)==c){
                    count++;
                }
            }
            if(count>1&&str1.indexOf(c)==i){
                System.out.println(c+" - "+count);
            }
        }


        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x-> (x.getValue()>1))
                .forEach(x -> System.out.println(x.getKey()));


    }
}
