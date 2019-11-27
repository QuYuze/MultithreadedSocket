//Thread Example 3
//Creates three threads, runs them concurrently but each thread is paused for a random
//time between 0 and 3 seconds
public class ThreadEx3 extends Thread {
    public static void main(String[] args) {
        ThreadEx3 thread1, thread2, thread3;
        thread1 = new ThreadEx3();
        thread2 = new ThreadEx3();
        thread3 = new ThreadEx3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void run(){
        int pause;
        for (int i=0; i<5; i++){
            try{
                System.out.println(getName() + " being executed");
                pause = (int)(Math.random()*3000);
                System.out.println("Sleep time for "+ getName() + ":" + pause + " millisecs");
                sleep(pause);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
