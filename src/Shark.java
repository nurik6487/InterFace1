public class Shark implements Swimablle {
    private String name;

    public Shark() {
    }

    public Shark(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Shark: " + "\n" + "name: " + name + "\n";
    }

    @Override
    public void swim() {
        System.out.println("Swimming in oceane");
    }
}