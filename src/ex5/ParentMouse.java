package ex5;

import ex3.Mouse;

import java.util.ArrayList;

public class ParentMouse extends Mouse {
    private ArrayList<Thread> threads;

    public ParentMouse(String name) {
        super(name);
        threads = new ArrayList<>();
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean running = true;
        while (running){

            for(Thread thread : threads){
                thread.start();
            }

            for(Thread thread : threads){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("The Childs mouses have finished to eat");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            super.eat();
            running = false;
        }
    }
}
