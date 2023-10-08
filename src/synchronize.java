class Table {
    synchronized public void displayTable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class ThreadOne extends Thread {
    Table t;

    public ThreadOne(Table t) {
        this.t = t;
    }

    public void run() {
        t.displayTable(5);
    }
}

class ThreadTwo extends Thread {
    Table t;

    public ThreadTwo(Table t) {
        this.t = t;
    }

    public void run() {
        t.displayTable(10);
    }
}

public class synchronize {
    public static void main(String[] args) {
        Table to = new Table();
        ThreadOne t1 = new ThreadOne(to);
        ThreadTwo t2 = new ThreadTwo(to);
        t1.start();
        t2.start();
    }
}
