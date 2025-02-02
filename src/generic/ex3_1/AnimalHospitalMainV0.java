package generic.ex3_1;

import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍", 1);
        Cat cat = new Cat("야", 10);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //개 병원에 고양이 전달 오류 발생 타입 안전
        //dogHospital.set(cat); //다른 타입 입력시 : 컴파일 오류

        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("멍2", 200));
        System.out.println(bigger);
    }
}
