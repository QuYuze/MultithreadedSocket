//Thread Example 4
//Creates two threads – Throw and Catch – and randomly switches between them
public class ThrowCatch {
    public static void main(String[] args)         {
        ThrowThread t = new ThrowThread();
        CatchThread c = new CatchThread();
        t.start();
        c.start();
    }
}
class ThrowThread extends Thread {
    public void run(){
        int pause;
        for (int i=0; i<5; i++){
            try{
                System.out.println("THROW!");
                pause = (int)(Math.random()*3000);
                sleep(pause);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class CatchThread extends Thread {
    public void run() {
        int pause;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("\t\t\t\tCATCH");

                pause = (int) (Math.random() * 3000);
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}