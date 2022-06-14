public class Test4 {
    public static void main(String[] args) {
        buyTick buyTick = new buyTick();
        new Thread(buyTick, "你们").start();
        new Thread(buyTick, "苦逼的我").start();
        new Thread(buyTick, "黄牛").start();

    }
}

class buyTick implements Runnable {

    boolean flag = true;
    //票
    private int tick = 10;

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void buy() throws InterruptedException {
        if (tick <= 0) {
            flag = false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "拿到了" + tick--);
    }
}