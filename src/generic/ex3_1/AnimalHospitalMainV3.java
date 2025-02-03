package generic.ex3_1;

import generic.animal_1.Animal;
import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        //타입 제한에 의하여 오류 생성생성생성
//      AnimalHospitalV3<Integer> catHospital1 = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍", 1);
        Cat cat = new Cat("야", 10);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //개 병원에 고양이 전달 오류 발생 타입 안전
        //dogHospital.set(cat); //다른 타입 입력시 : 전달 가능 컴파일 오휴가 발생하지 않음

        dogHospital.set(dog);
        Animal bigger = dogHospital.bigger(new Dog("멍22", 200));
        System.out.println(bigger);
    }
}
