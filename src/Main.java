import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Shark[] sharks = {
                new Shark("Nurman"),
                new Shark("Merlin"),
                new Shark("Marlis"),
                new Shark("Tima"),
                new Shark("Logan"),};
        System.out.println(Arrays.toString(sharks));
        Shark shark = new Shark();
        shark.swim();

        Duck[] ducks = {
                new Duck("Mike"),
                new Duck("Mars"),
                new Duck("Venera"),
                new Duck("Mariana"),
                new Duck("Naruto"),};
        System.out.println(Arrays.toString(ducks));
        Duck duck = new Duck();
        duck.swim();

        Crocodile[] crocodiles = {
                new Crocodile("Jeff"),
                new Crocodile("Bella"),
                new Crocodile("Aitunuk"),
                new Crocodile("Aruke"),
                new Crocodile("Aisulu"),};
        System.out.println(Arrays.toString(crocodiles));
        Crocodile crocodile = new Crocodile();
        crocodile.swim();


        Swim swim =new Swim(sharks,ducks,crocodiles);
        System.out.println(swim);



    }
}