import java.util.Arrays;

public class GenericsPract {
    public static void main(String [] args){
        Double [] arr = {10.23,32.2,5.32,65.32,67.32};
        sortArray(arr);
    }
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        T ref;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i].compareTo(array[j])<0){
                    ref=array[i];
                    array[i]=array[j];
                    array[j]=ref;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }



}
