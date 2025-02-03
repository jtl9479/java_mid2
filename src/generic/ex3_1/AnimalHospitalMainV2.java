package generic.ex3_1;

import generic.animal_1.Animal;
import generic.animal_1.Cat;
import generic.animal_1.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital1 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> dogHospital2 = new AnimalHospitalV2<>();
        //관련 없는 오브젝트 타입이 들어올 수 있다.
        // 매개변수를 animal로 제한하지 않아서 생긴 문제이다.
        AnimalHospitalV2<Integer> dogHospital3 = new AnimalHospitalV2<>();
        AnimalHospitalV2<String> dogHospital4 = new AnimalHospitalV2<>();
    }
}
