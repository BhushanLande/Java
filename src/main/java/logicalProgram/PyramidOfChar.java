package logicalProgram;

public class PyramidOfChar {
    public static void main(String [] args){
        int rows =4;
        char ch = 'a';
        for( int i=1; i<=rows; i++){

            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
            ch='a';
        }
    }
}
