package study;

public class ThreadStudy {
    public static void main(String[] args) {
        Runnable threadTask3 = new ThreadTask3();
        Thread thread1 = new Thread(threadTask3);
        Thread thread2 = new Thread(threadTask3);

        thread1.setName("김코딩");
        thread2.setName("박자바");

        thread1.start();
        thread2.start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int money) {
        synchronized (this) {
            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                balance -= money;
                return true;
            }
        }
        return false;
    }
}

class ThreadTask3 implements Runnable {
    Account account = new Account();

    public void run() {
        while (account.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            boolean denied = !account.withdraw(money);

            System.out.println(String.format("[인출 %d₩] [By %s] [잔액 %d] %s",
                    money, Thread.currentThread().getName(),
                    account.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}

class ThreadExample5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    while (true) Thread.sleep(1000);
                } catch (Exception ignored) {
                }
                System.out.println("Woke Up!!!");
            }
        };

        System.out.println("thread1.getState() = " + thread1.getState());

        thread1.start();

        System.out.println("thread1.getState() = " + thread1.getState());

        while (true) {
            if (thread1.getState() == Thread.State.TIMED_WAITING) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }
        }

        thread1.interrupt();

        while (true) {
            if (thread1.getState() == Thread.State.RUNNABLE) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }
        }

        while (true) {
            if (thread1.getState() == Thread.State.TERMINATED) {
                System.out.println("thread1.getState() = " + thread1.getState());
                break;
            }
        }
    }
}
