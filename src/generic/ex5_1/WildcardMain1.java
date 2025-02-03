package generic.ex5_1;

import generic.animal_1.Animal;
import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class WildcardMain1<T extends Animal> {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("ajd", 2));
        catBox.set(new Cat("aj1d", 200));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV1(catBox);
        WildcardEx.printGenericV2(dogBox);

        //Cat cat = WildcardEx.printGenericV3(dogBox);
        Cat cat = WildcardEx.printGenericV3(catBox);

        System.out.println("1");
        WildcardEx.printWildcard(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        Animal animal = WildcardEx.printWildcardV3(catBox);
    }
}
