public class Ex1 extends Thread {

    public static void main(String[] args) {
        Ex1 hanSolo, DarthVader, LukeSkywalker, Chewbacca, BB8;
        hanSolo = new Ex1();
        DarthVader = new Ex1();
        LukeSkywalker  = new Ex1();
        Chewbacca = new Ex1();
        BB8 = new Ex1();

        hanSolo.setName("Han Solo");
        DarthVader.setName("Darth Vader");
        LukeSkywalker.setName("Luke Skywalker");
        Chewbacca.setName("Chewbacca");
        BB8.setName("BB8");

        hanSolo.start();
        DarthVader.start();
        LukeSkywalker.start();
        Chewbacca.start();
        BB8.start();

    }

    public void run(){
        int pause;
        for (int i=0; i<5; i++){
            try{
                System.out.println(getName() + " awake!");
                pause = (int)(Math.random()*3000);
                System.out.println(getName() + " asleep for " + pause + " millisecs");
                sleep(pause);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
