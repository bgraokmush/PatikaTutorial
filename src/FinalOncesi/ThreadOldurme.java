package FinalOncesi;

public class ThreadOldurme {
    public static void main(String[] args) {
        C c = new C();
        c.start();
    }
}


class C extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) stop();
            System.out.println("C");
        }
    }
}
