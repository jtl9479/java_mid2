package generic.ex5_1;

import generic.animal_1.Animal;
import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class WildcardMain2<T extends Animal> {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //상위 타입 전달 가능
         writeBox(obj);
         writeBox(animalBox);
         //writeBox(dogBox);
         //writeBox(catBox);
    }

    static void writeBox (Box<? super Animal> box) {
        box.set(new Dog("멍", 100));
    }

    static void writeBox1 (Box<S> box) {
        //box.set(new Dog("멍", 100));
    }
}
