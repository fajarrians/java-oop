package programmer.aplication;

import programmer.annotation.Fancy;
import programmer.data.Animal;
import programmer.data.Cat;

//@Fancy(name = "car", tags = {"app","java"}) //Annotation
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
