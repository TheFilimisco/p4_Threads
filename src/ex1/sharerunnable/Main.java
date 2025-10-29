package ex1.sharerunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Feeder feederMouse = new Feeder("main Feeder", 10);

        Thread mouse1 = new Thread(feederMouse);
        Thread mouse2 = new Thread(feederMouse);

        mouse1.setName("mouse1");
        mouse2.setName("mouse2");

        mouse1.start();
        mouse2.start();

        mouse1.join();
        mouse2.join();

        System.out.println("Finish food " + feederMouse.getAmountFeed());


    }
}
