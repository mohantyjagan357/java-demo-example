package example;

public class MT_Runnable {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread thread = new Thread(obj);
        thread.start();
    }
    public static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());

        }
    }
}
