package ex1.sharerunnable;

import java.util.ArrayList;
import java.util.List;

public class Feeder  implements Runnable {
    final private String name;
    private int amountFeed;

    public Feeder(String name, int amountFeed) {
        this.name = name;
        this.amountFeed = amountFeed;
    }

    public Feeder(String name) {
        this.name = name;
        amountFeed = 20;

    }

    public String getName() {
        return name;
    }

    public int getAmountFeed() {
        return amountFeed;
    }

    public void setAmountFeed(int amountFeed) {
        this.amountFeed = amountFeed;
    }

    @Override
    public void run() {
        feed();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    private void feed(){
        String currentThreadName = Thread.currentThread().getName();
        for (int i = amountFeed; i >= 0; i--){
            amountFeed = i;
            System.out.println(currentThreadName + " is eating and now " + amountFeed);
        }
    }
}
