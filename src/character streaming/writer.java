import java.io.*;

public class writer {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("xyz.txt");
            fw.write(65);
            char ch[] = { 'p', 'p', 'l', 'e' };
            fw.write(ch);
            fw.write(" keep doctor away ");
            fw.flush();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
