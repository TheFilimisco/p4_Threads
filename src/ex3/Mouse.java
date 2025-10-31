package ex3;

public class Mouse implements Runnable{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        eat();

    }

    public void eat(){
        System.out.println("The mouse " + name +" has started to eat");
        System.out.println("The mouse " + name +" is eating");
        System.out.println("The mouse " + name +" has stopped to eat");
    }

}
