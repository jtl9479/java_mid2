package generic.animal_1;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍", 110);
        Cat cat = new Cat("야옹", 60);

        Box<Animal>animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(cat);
        animalBox.setValue(dog);

        System.out.println(animalBox.getValue());
    }
}
