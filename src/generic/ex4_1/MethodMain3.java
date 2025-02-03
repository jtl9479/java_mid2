package generic.ex4_1;

import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍", 1);
        Cat cat = new Cat("옹", 1);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println(returnCat);
        //class dog
        //매개변수 cat

    }
}
