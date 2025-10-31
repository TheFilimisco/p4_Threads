package ex4;

import ex3.Mouse;
import ex3.MouseStoppable;

import java.util.ArrayList;

public class ParentMouse extends Mouse {
    ArrayList<Thread> threads;

    public ParentMouse(String name) {
        super(name);
        threads = new ArrayList<>();
    }

    @Override
    public void run() {
        boolean running = true;

        while (running){
            for(Thread t:threads){
                t.start();
            }

            for(Thread t:threads){
                while (t.isAlive()){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

            super.eat();
            running = false;
        }
    }
}
