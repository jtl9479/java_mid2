package generic.ex5_1;

import generic.animal_1.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println(box.get());
    }


    //Box<Dog>, Box<Cat>, Box(Object)
    static void printWildcard(Box<?> box) {
        System.out.println(box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {//T는 animal이다.
        //Box<T> box -> Box<Animal> box
        T t = box.get();    //Animal t = box.get();
        System.out.println(box.get());
        System.out.println(t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {//T는 animal이다.
        Animal animal = box.get();
        System.out.println(animal.getName());
    }

    static <T extends Animal> T printGenericV3(Box<T> box) {//T는 animal이다.
        //Box<T> box -> Box<Animal> box
        T t = box.get();    //Animal t = box.get();
        System.out.println(t.getName());
        return t;
    }

    static Animal printWildcardV3(Box<? extends Animal> box) {//T는 animal이다.
        //Box<T> box -> Box<Animal> box
        Animal animal = box.get();    //Animal t = box.get();
        System.out.println(animal.getName());
        return animal;
    }
}