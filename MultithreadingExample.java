class OddNumberThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of series: " + sum);
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        OddNumberThread oddThread = new OddNumberThread();
        SumThread sumThread = new SumThread();
        oddThread.start();
        sumThread.start();
    }
}

