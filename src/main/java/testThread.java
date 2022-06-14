public class testThread implements Runnable {


    private static int sum = 1000;
    private static String winner = null;

    public static void main(String[] args) {
        testThread testThread = new testThread();
        new Thread(testThread, "兔子").start();
        new Thread(testThread, "乌龟").start();
    }

    public boolean test(int steps) {
        if (sum - 1 == steps) {
            return true;
        } else return false;
    }

    @Override
    public void run() {
        if (winner == null) {
            for (int i = 0; i < 1000; i++) {
                if (test(i) == true) {
                    System.out.println("胜利者是" + Thread.currentThread().getName());
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
            }
        }
    }


}
