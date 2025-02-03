package generic.ex4_1;

public class GenericMethod {
    public static Object objMethod(Object object) {
        System.out.println(object);
        return object;
    }

    //반환타입앞 제네릭 메소드의 경우 <T>선언하여 사용 해당 메소드에만 범위 적용
    public static <T> T genericMethod(T object) {
        System.out.println(object);
        return object;
    }

    //반환타입앞 제네릭 메소드의 경우 <T>선언하여 사용 해당 메소드에만 범위 적용
    public static <T extends Number> T numberMethod(T object) {
        System.out.println(object);
        return object;
    }

    //반환타입앞 제네릭 메소드의 경우 <T>선언하여 사용 해당 메소드에만 범위 적용
    public <T extends String> T numberMethod1(T object) {
        System.out.println(object);
        return object;
    }
}
