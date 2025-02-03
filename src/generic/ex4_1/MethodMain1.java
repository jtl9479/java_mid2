package generic.ex4_1;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod("");

        //타입 인자 명시적 전달 해당 메소드는 타입 인자로 사용가능
        //타입 제한을 하지 않아 String 사용 가능
        GenericMethod.<Integer>genericMethod(i);

        //타입 제한을 하여 number형 외에는 사용 불가
        GenericMethod.<Integer>numberMethod(i);
        GenericMethod.<Double>numberMethod(10.0);

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<String>numberMethod1("");

        //제네릭 메서드 타입 추론 가능
        //인자 타입을 가지고 추론이 가능하다.
        GenericMethod.numberMethod(i);//GenericMethod.<Integer>numberMethod(i);
        GenericMethod.numberMethod(10.0);//GenericMethod.<Double>numberMethod(10.0);
    }
}
