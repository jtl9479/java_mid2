package generic.ex4_1;

import generic.animal_1.Animal;

public class ComplexBox<T extends Animal> {
    private  T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }

    public <An extends Animal> An printAndReturn(An z){
        System.out.println(animal.getClass().getName());
        System.out.println(z.getClass().getName());
        z.getSize();
        return z;
    }
}
