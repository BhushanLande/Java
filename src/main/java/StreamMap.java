import java.util.*;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String [] args) {
        Integer arr [] = {10,39,42,49,30};
        List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
        String str = "bhushan lande";

        String [] astr = str.split(" ");
        String s = Arrays.stream(astr).map(x -> Character.toUpperCase(x.charAt(0)) + x.substring(1)).collect(Collectors.joining(" "));
        String s1 = Arrays.stream(astr).map(x -> x.toUpperCase()).collect(Collectors.joining(" "));
        System.out.println(s);
        System.out.println(s1);

    }
}

