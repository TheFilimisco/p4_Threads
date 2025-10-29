package ex1.shareStatic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Feeder feederMouses = new Feeder("Main Feeder");
        Feeder feederMouses2 = new Feeder("Secondary Feeder");

        Thread mouse1 = new Thread(feederMouses);
        Thread mouse2 = new Thread(feederMouses);

        Thread mouse3 = new Thread(feederMouses2);
        Thread mouse4 = new Thread(feederMouses2);

        mouse1.setName("Mouse1");
        mouse2.setName("Mouse2");
        mouse3.setName("Mouse3");
        mouse4.setName("Mouse4");

        mouse1.start();
        mouse2.start();
        mouse3.start();
        mouse4.start();

        mouse1.join();
        mouse2.join();
        mouse3.join();
        mouse4.join();


        System.out.println("Finish food " + feederMouses.getAmountFeed());

    }
}
