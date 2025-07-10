package logicalProgram;

public class SwapString {
    public static void main(String [] args){
        String firstName ="Bhushan";
        String lastName ="Lande";

        firstName =firstName+lastName;
        lastName = firstName.substring(0,(firstName.length()-lastName.length()));
        firstName=firstName.substring(lastName.length());

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
