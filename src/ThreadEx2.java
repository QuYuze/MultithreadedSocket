//Thread Example 2
//Creates two threads and runs them concurrently five times
public class ThreadEx2 extends Thread {
    public static void main(String[] args) {
        ThreadEx2 thread1, thread2;
        thread1 = new ThreadEx2();
        thread2 = new ThreadEx2();
        thread1.start();
        thread2.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " being executed");
        }
    }
}

