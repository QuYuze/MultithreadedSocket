public class Ex2 extends Thread{

    public static void main(String[] args) {
        Ex2 hanSolo, DarthVader, LukeSkywalker, Chewbacca, BB8;
        hanSolo = new Ex2();
        DarthVader = new Ex2();
        LukeSkywalker  = new Ex2();
        Chewbacca = new Ex2();
        BB8 = new Ex2();

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
                System.out.println(getName() + ": Throw LightSaber!");
                pause = (int)(Math.random()*3000);
                System.out.println("                        " + getName() + ": Catch LightSaber!");
                sleep(pause);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
