import java.io.FileOutputStream;

public class filehandling {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("abc.txt", true);
            fo.write(1231);
            fo.flush();
            fo.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
