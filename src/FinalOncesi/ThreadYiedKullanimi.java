package FinalOncesi;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                Thread.yield();
            }
            System.out.println("A-"+i);
        }
        System.out.println("A bitti");
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B-" + i);
        }
        System.out.println("B bitti");
    }
}

public class ThreadYiedKullanimi {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
