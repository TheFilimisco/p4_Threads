package ex3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MouseStoppable mouseStoppable = new MouseStoppable("MouseStoppable");
        Mouse mouse1 = new Mouse("Mouse1");
        Mouse mouse2 = new Mouse("Mouse2");


        Thread mouseStop = new Thread(mouseStoppable);
        Thread mouseOne = new Thread(mouse1);
        Thread mouseTwo = new Thread(mouse2);

        mouseStop.start();
        mouseOne.start();
        mouseTwo.start();

        Thread.sleep(6000);

        mouseStoppable.stopRunning();
    }
}
