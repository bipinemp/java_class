class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("THread");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello world");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        MyThread obj = new MyThread();
        HelloThread obj1 = new HelloThread();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);
        obj.start();
        obj1.start();
        System.out.println("Hello, World!");

    }
}
