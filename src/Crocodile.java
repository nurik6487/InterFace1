public class Crocodile implements Swimablle {
    private String name;

    public Crocodile() {
    }

    public Crocodile(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Crocodile swimming in river");
    }

    @Override
    public String toString() {
        return "Crocodile: " + "\n" +
                "name: " + name + "\n";
    }
}
