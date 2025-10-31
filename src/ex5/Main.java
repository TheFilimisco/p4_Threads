package ex5;

import ex3.MouseStoppable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParentMouse parentMouse = new ParentMouse("ParentMouse");

        MouseStoppable mouseStoppable = new MouseStoppable("MouseStoppable");
        MouseStoppable mouseStoppable2 = new MouseStoppable("MouseStoppable2");

        Thread threadParentMouse = new Thread(parentMouse);
        Thread threadMouseStoppable = new Thread(mouseStoppable);
        Thread threadMouseStoppable2 = new Thread(mouseStoppable2);

        parentMouse.getThreads().add(threadMouseStoppable);
        parentMouse.getThreads().add(threadMouseStoppable2);

        threadParentMouse.start();
        Thread.sleep(9000);

        mouseStoppable.stopRunning();
        mouseStoppable2.stopRunning();


    }
}
