class testStop implements Runnable {

    //标志
    private boolean flag = true;

    public void stop() {
        flag = false;
    }


    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("Thread" + i++);

        }
    }
}

public class test02 {
    public static void main(String[] args) {
        testStop testStop = new testStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i == 900) {
                testStop.stop();
                System.out.println("线程停止");
            }
        }
    }
}