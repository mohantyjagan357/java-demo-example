package bankSynchronization;

public class BankSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Bank obj1 = new Bank(1, 300);
        Bank obj2 = new Bank(2, 500);

        long start = System.currentTimeMillis();

        MyThread[] threads = new MyThread[6];

        threads[0] = new MyThread(obj1, true, 100);
        threads[1] = new MyThread(obj1, false, 50);
        threads[2] = new MyThread(obj1, true, 100);

        threads[3] = new MyThread(obj2, false, 100);
        threads[4] = new MyThread(obj2, true, 150);
        threads[5] = new MyThread(obj2, false, 200);

        for (int i = 0; i<threads.length; i++){
            threads[i].start();
        }

        for (int i = 0; i<threads.length; i++){
            threads[i].join();
        }

        System.out.println("Amount in account1:- "+obj1.getBalance());
        System.out.println("Amount in account2:- "+obj2.getBalance());


        System.out.println("Time consumed:- "+(System.currentTimeMillis()-start));

    }

    public static class MyThread extends  Thread{
        private Bank obj;
        private boolean isDeposit;
        private  int amount;

        public MyThread(Bank obj, boolean isDeposit, int amount){
            this.obj = obj;
            this.isDeposit = isDeposit;
            this.amount = amount;
        }

        @Override
        public void run() {
            if (this.isDeposit){
                deposit();
            }else {
                withdraw();
            }

        }

        private void withdraw() {
            System.out.println("In Withdraw function : Amount in "+obj.getAccountNo()+" & in thread "+currentThread().getName());
            obj.setBalance(obj.getBalance()-amount);
        }

        private void deposit() {
            System.out.println("In deposit function : Amount in "+obj.getAccountNo()+" & in thread "+currentThread().getName());
            obj.setBalance(obj.getBalance()+amount);
        }
    }
}
