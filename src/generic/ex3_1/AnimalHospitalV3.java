package generic.ex3_1;

import generic.animal_1.Animal;

public class AnimalHospitalV3<T extends Animal> {//Animal 상속받음 해당 오브젝트의 기능을 사용 가능 타입 매개변수 제한.
    //타입매개변수 `T` 에는타입인자로 `Animal` , `Dog` , `Cat` 만들어올수있다.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
