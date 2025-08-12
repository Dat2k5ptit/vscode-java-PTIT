import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args){
       try {
             Scanner sc = new Scanner(new File("Hello.txt"));
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
       } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
       }
        
    }
}
