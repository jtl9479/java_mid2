package generic.animal_1;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍", 110);
        Cat cat = new Cat("야옹", 60);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        System.out.println(dogBox.getValue());

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        System.out.println(catBox.getValue());

        Box<Animal> animalBox  = new Box<>();
        animalBox.setValue(animal);
        System.out.println(animalBox.getValue());
    }
}
