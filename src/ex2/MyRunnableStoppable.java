package ex2;

public class MyRunnableStoppable implements  Runnable {
    private boolean timeToStop = false;

    @Override
    public void run() {
        while (!timeToStop){
            {
                System.out.println("Im Thread "
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void stopRunning(){
        timeToStop = true;
    }
}
