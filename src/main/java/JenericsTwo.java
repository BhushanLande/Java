import java.util.*;

public class JenericsTwo {
    public static void main(String [] args){
        isFactorialNumber(6.0);
        isFactorialNumber(2);
        isFactorialNumber(2f);
        Integer [] n = {123, 32, 545, 65};
        String [] str = {"Bhushan", "Aditya", "Mayur", "Vishal"};

        printArray(n);
        printArray(str);
    }
    public static <T extends Number> void isFactorialNumber(T num){
        int ref=1;
        int n = num.intValue();
        for(int i=1; i<=n; i++){
            ref *= i;
        }
        System.out.println(ref);
    }

    public static <T> void printArray(T [] array){
        Arrays.stream(array).forEach(System.out::println);
    }

}
