package ex1;

public class MouseStoppable extends Mouse implements Runnable {
    private boolean timeToStop = false;

    public MouseStoppable(String name) {
        super(name);
    }

    public void stopRunning(){

    }
}
