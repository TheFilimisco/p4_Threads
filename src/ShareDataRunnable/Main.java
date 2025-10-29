package ShareDataRunnable;

public class Main {
    public  static void main(String[] args) throws InterruptedException {
        ShareRecipe shareRecipe = new ShareRecipe("Lasaña");

        Thread thread1 = new Thread(shareRecipe);
        Thread thread2 = new Thread(shareRecipe);

        thread1.setName("Chef one");
        thread2.setName("Chef two");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Finish the counter: " + shareRecipe.getCounter());
    }
}
