import java.lang.reflect.Array;

public class Duck implements Swimablle {
    private String name;

    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming in lake");
    }

    @Override
    public String toString() {
        return "Duck: " + "\n" +
                "name: " + name+"\n";
    }
}

