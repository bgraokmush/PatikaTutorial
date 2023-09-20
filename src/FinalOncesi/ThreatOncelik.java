package FinalOncesi;

public class ThreatOncelik {
    public static void main(String[] args) {
        Robot r1 = new Robot("Robot 1");
        Robot r2 = new Robot("Robot 2");
        Robot r3 = new Robot("Robot 3");
        Robot r4 = new Robot("Robot 4");

        r1.setPriority(Thread.MAX_PRIORITY);
        r2.setPriority(Thread.MIN_PRIORITY);
        r3.setPriority(Thread.NORM_PRIORITY);
        r4.setPriority(8);

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}


class Robot extends Thread{

    public Robot(String isim){
        super(isim);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Öncelik-> " + this.getPriority() + " ->" +this.getName() + " calisiyor...");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}