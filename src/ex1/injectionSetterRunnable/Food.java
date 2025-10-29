package ex1.injectionSetterRunnable;

public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    public void consume(int inputAmount) {
        if(amount > inputAmount){
            amount -= inputAmount;
            System.out.println(Thread.currentThread().getName() + ": Consumed " + inputAmount + " from " + amount);
        }
    }

    public int getAmount() {
        return amount;
    }
}
