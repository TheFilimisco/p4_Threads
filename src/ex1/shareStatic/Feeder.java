package ex1.shareStatic;

public class Feeder implements Runnable{
    final private String name;
    private static int amountFeed = 100;

    public Feeder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAmountFeed() {
        return amountFeed;
    }

    @Override
    public void run() {
        feed();
    }

    public void feed() {
        while (amountFeed > 0) {
            String nameCurrent = Thread.currentThread().getName();
                if (amountFeed > 0) {
                    amountFeed--;
                    System.out.println("The mouse(Thread): "+ nameCurrent + " : " + name + " feeding " + amountFeed + " feed");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
}


