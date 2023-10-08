import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("xyz.txt");
            int c = fi.read();

            while (c != -1) {
                System.out.println((char) c);
                c = fi.read();
            }

            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
