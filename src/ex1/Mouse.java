package ex1;

public class Mouse implements Runnable {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        this.eat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("El ratolí " + name + " ha començat a menjar");
        System.out.println("El ratolí " + name + " està menjant");
        System.out.println("El ratolí " + name + " ha acabat de menjar");
    }
}
