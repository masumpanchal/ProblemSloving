public class DeadLock {
    public static void main(String[] args)throws InterruptedException{
        myThread t = new myThread();
        t.m1();
    }
}

class myThread extends Thread {
    DeadLockDemo D1 = new DeadLockDemo();
    DeadLockDemo2 D2 = new DeadLockDemo2();

    public void m1() throws InterruptedException {
        this.start();
        Thread.sleep(2000);
        D1.method1();
    }
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        D2.method2();
    }
}


class DeadLockDemo  {
    public void method1(){
        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer.class object");
            synchronized (String.class){
                System.out.println("Acquired lock on String.Class object");
            }
        }
    }
}
    class DeadLockDemo2{

    public void method2(){
        synchronized (Integer.class){
            System.out.println("Acquired lock on String.class object");
            synchronized (String.class){
                System.out.println("Acquired lock on Integer.class object");
            }
        }
    }
}
