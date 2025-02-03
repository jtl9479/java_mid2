package generic.ex4_1;

import generic.animal_1.Animal;

public class AnimalMethod {

    //animal 관련 오브젝트만 들어온다.
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }
    public static <T extends Animal> T getBigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
