package generic.ex3_1;

import generic.animal_1.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target ) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
