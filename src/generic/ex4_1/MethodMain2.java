package generic.ex4_1;

import generic.animal_1.Animal;
import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍", 1);
        Cat cat = new Cat("옹", 1);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);
        AnimalMethod.checkup(new Animal("야", 2));

        Dog target = new Dog("멍1", 2);
        AnimalMethod.getBigger(dog, target);
    }
}
