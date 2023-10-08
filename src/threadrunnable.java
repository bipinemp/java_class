class MyRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread1");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread2");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class threadrunnable {
    public static void main(String[] args) {
        MyRunnable run1 = new MyRunnable();
        MyRunnable1 run2 = new MyRunnable1();

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
