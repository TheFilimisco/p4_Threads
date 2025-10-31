package ex4;

import ex3.MouseStoppable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParentMouse parentMouse = new ParentMouse("ParentMouse");
        MouseStoppable mouseStoppable = new MouseStoppable("MouseStoppable");
        MouseStoppable mouseStoppable2 = new MouseStoppable("MouseStoppable2");
        MouseStoppable mouseStoppable3 = new MouseStoppable("MouseStoppable3");


        Thread threadParentMouse = new Thread(parentMouse);
        Thread threadMouseStoppable = new Thread(mouseStoppable);
        Thread threadMouseStoppable2 = new Thread(mouseStoppable2);
        Thread threadMouseStoppable3 = new Thread(mouseStoppable3);

        parentMouse.threads.add(threadMouseStoppable);
        parentMouse.threads.add(threadMouseStoppable2);
        parentMouse.threads.add(threadMouseStoppable3);

        threadParentMouse.start();
        Thread.sleep(8000);
        mouseStoppable.stopRunning();
        mouseStoppable2.stopRunning();
        mouseStoppable3.stopRunning();


    }
}
