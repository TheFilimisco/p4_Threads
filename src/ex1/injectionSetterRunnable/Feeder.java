package ex1.injectionSetterRunnable;

public class Feeder implements Runnable{
    final private String name;
    private Food shareFood;

    public Feeder(String name) {
        this.name = name;
    }

    public void setShareFood(Food shareFood) {
        this.shareFood = shareFood;
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            shareFood.consume(1);
            if (shareFood.getAmount() <= 0) {
                running = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                running = false;
                System.out.println(e.getMessage());
            }
        }
    }
}




