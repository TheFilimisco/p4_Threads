package ex1.injectionSetterRunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Food food = new Food(10);

        Feeder f1 = new Feeder("Feeder-1");
        Feeder f2 = new Feeder("Feeder-2");

        // Injection the object to runnable
        f1.setShareFood(food);
        f2.setShareFood(food);

        Thread mouse1 = new Thread(f1);
        Thread mouse2 = new Thread(f2);

        mouse1.setName("mouse1");
        mouse2.setName("mouse2");

        mouse1.start();
        mouse2.start();

        mouse1.join();
        mouse2.join();

        System.out.println("The food is empty " + food.getAmount());

    }


}
