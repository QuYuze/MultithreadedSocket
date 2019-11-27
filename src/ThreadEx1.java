//Thread Example 1 //
// This example creates two threads and displays their names.
public class ThreadEx1 extends Thread {
    public static void main(String[] args){
        ThreadEx1 thread1, thread2;
        thread1 = new ThreadEx1();
        thread2 = new ThreadEx1();
        System.out.println(thread1.getName());
         System.out.println(thread2.getName());
    }
}

