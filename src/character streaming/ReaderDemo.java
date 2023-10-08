import java.io.*;

public class ReaderDemo {
    public static void main(String args[]) {
        try {
            File f = new File("xyz.txt");
            char ch[] = new char[(int) f.length()];
            FileReader fr = new FileReader(f);
            fr.read(ch);
            for (char c : ch) {
                System.out.println(c);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
