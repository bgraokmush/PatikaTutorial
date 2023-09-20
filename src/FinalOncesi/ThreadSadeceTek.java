package FinalOncesi;

//Aynı anda tek iş bir iş parçacığı yürütebilir
public class ThreadSadeceTek {
    public static void main(String[] args) {
        D d = new D();
        Thread thread1 = new Thread(d);
        Thread thread2 = new Thread(d);
        thread1.start();
        thread2.start();
    }
}

 class D implements Runnable{

    public void topla(int i){
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread().getName() + "=>"+
                    (i+j));
        }
    }

    public synchronized void topla(double i){
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread().getName() + "=>"+
                    (i+j));
        }
    }
     @Override
     public void run() {
         topla(10);
         topla(5.0);
     }
 }