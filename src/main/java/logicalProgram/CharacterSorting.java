package logicalProgram;


public class CharacterSorting {
    public static void main(String [] args) {
        String str = "bhush@n#525";

        StringBuilder charr = new StringBuilder();
        StringBuilder intt = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for(char c :str.toCharArray()){
            if (Character.isDigit(c)) {
                intt.append(c);
            }else if (Character.isAlphabetic(c)){
                charr.append(c);
            } else {
                symbols.append(c);
            }
        }

        System.out.println("String: "+charr);
        System.out.println("Integers: "+intt);
        System.out.println("Symbols: "+symbols);
    }
}
