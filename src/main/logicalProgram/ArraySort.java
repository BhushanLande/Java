package logicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String [] args){
        Integer[] array = {10,4,39,76,87,67};

        // Integer provides feasibility to work over collections
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        //To convert into arraylist
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(array));
        System.out.println(ar);

        //Array sort without sort
        int temp;
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length; j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

        System.out.println(array[array.length-2]);
    }
}
