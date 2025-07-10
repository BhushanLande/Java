import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIOClass {
    public static void main(String [] args) throws IOException {

        // To write and read file using buffer reader and writes
        Path filePath2 = Paths.get(System.getProperty("user.home"), File.separator+"IdeaProjects"+File.separator+"Practice1"+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator, "newq.txt");
        File file = filePath2.toFile();
//        FileWriter br2 = new FileWriter(file, true);
        BufferedWriter br2 = new BufferedWriter(new FileWriter(file, true));
        // Write new content to the file
        br2.write("Aditya New line\n");
        br2.write("Bhushan New line\n");

//        br2.close(); // To close whole stream
        br2.flush(); // To close writing temp

        /*... File reading using char by char using variable casting ...*/
        FileReader br = new FileReader(file);
        int s =0;
        while ((s = br.read())!=-1){
            System.out.print((char)s);
        }

        /*... File reading using input stream using byte object ...*/
        FileInputStream obj = new FileInputStream("C:"+File.separator+"Users"+File.separator+"Bhushan lande"+File.separator+"IdeaProjects"+File.separator+"Practice1"+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"new.txt");


        int size = obj.available();
        System.out.println(size);
        byte [] b =  new byte[size];
        obj.read(b);
        String str = new String(b);
        System.out.println(str);

        /*... File Writing using buffer class ...*/
        String strr = " This is to be append in neww file";
        String str1 = "\n New line ";
        Path filePath1 = Paths.get(System.getProperty("user.home"), "\\IdeaProjects\\Practice1\\src\\main\\java\\", "neww.txt");
        System.out.println(filePath1);
//        FileOutputStream obj1 = new FileOutputStream(filePath.toFile(), true);
        BufferedOutputStream obj2  = new BufferedOutputStream(new FileOutputStream(filePath1.toFile(), true));
        byte[] by = str1.getBytes();
        obj2.write(by);
        obj2.close();

        /*... File reading buffer reader which reads file in chunk and provides readLine() method ...*/
        Path filePath = Paths.get(System.getProperty("user.home"), "\\IdeaProjects\\Practice1\\src\\main\\java\\", "neww.txt");
        BufferedReader b2 = new BufferedReader(new FileReader(filePath.toFile()));

        String ss = "";
        while((ss = b2.readLine())!=null) {
            System.out.println(ss);
        }
    }
}
