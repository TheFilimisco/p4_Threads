package ex3;

public class MouseStoppable extends Mouse{
    private boolean timeToStop = false;

    public MouseStoppable(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(!timeToStop){
            try{
                super.eat();
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void stopRunning(){
        timeToStop = true;
    }

}
