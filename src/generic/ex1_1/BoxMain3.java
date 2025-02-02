package generic.ex1_1;

public class BoxMain3 {

    public static void main(String[] args) {
        //생성시 타입 결정
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.set(10);

        //integerGenericBox.set("스트링"); 컴파일 오류 발생

        System.out.println(integerGenericBox.get());

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("10");
        //stringGenericBox.set(10);타입 오류 생성
        System.out.println(stringGenericBox.get());

        //원하는 모든 타입 사용 가능
        //타입 추론,생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox1 = new GenericBox<>();
    }
}
