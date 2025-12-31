package logicalProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number to check armstrong Number: ");
        int num = sc.nextInt();

        double ref = 0;
        double temp;
        int value = num;
        int length = String.valueOf(num).length();

        while(num>0){
            temp = num%10;
            ref = Math.pow(temp,length)+ref;
            num /=10;
        }

        if (ref == value){
            System.out.println(value+ " is an armstrong number");
        }
        else {
            System.out.println(value+ " is not an armstrong number");
        }
    }
}
