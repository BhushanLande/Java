package logicalProgram;

public class PalindromeNumber {
    public static void main(String [] args){
        int num = 12321;
        System.out.println(num);

        int temp;
        int ref =0;

        while (num>0){
            temp = num%10;
            ref = ref*10+temp;
            num=num/10;
        }

        System.out.println(ref);
    }
}
