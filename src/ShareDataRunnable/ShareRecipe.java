package ShareDataRunnable;

public class ShareRecipe implements Runnable {
    private int counter;
    private String name;

    public ShareRecipe(String name) {
        counter = 0;
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {

        // 1. To get the object current
        // This object has name assigned with.setName();
        String currentThreadName = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            counter++;

            // 2. We use the name of currentThreadName
            System.out.println(currentThreadName + " (Recipe: " + name + ") counter is increment: " + counter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sleep Error" + e.getMessage());
            }
        }


    }
}
