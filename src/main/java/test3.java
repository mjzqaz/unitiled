import org.junit.Test;

//模拟sleep
public class test3 {
    @Test
    public void test01() {
        you QQQ = new you();
        God god = new God();
        Thread God = new Thread(god);
        new Thread().setDaemon(true);//守护线程
        God.start();
        new Thread(QQQ).start();

    }
}


class you implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("开心的活着呢");
            if (i == 100) {
                System.out.println("再见了宝，我走了");
            }
        }
    }
}

class God implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑你");
        }
    }
}