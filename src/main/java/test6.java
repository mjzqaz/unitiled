public class test6 {
    public static void main(String[] args) {
        bear bear;

    }
}


class production extends Thread {

}

class customer extends Thread {
}

class Chicken {
    private int id;
}

class bear {
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    //生产者放入
    public synchronized void push(Chicken chicken) {
        if (count == chickens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            chickens[count] = chicken;
            count++;
        }
    }

    public synchronized Chicken get() {
        if (count == 0) {

        }
        count--;
        Chicken chicken = chickens[count];

        return chicken;
    }

}