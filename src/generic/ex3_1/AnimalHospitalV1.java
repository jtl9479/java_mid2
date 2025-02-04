package generic.ex3_1;

import generic.animal_1.Animal;

public class AnimalHospitalV1 {
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
