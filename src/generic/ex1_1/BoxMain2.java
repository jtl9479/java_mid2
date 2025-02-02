package generic.ex1_1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println(integer);
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println(str);

        //잘못된 타입의 인수 전달시 타입 안전성에 문제가 생긴다.
        //integerBox.set("문자100");
        integerBox.set(1100);
        Integer result = (Integer) integerBox.get(); //String -> integer  캐스팅 예외
        //Exception in thread "main" java.lang.ClassCastException:
        System.out.println(result);
    }
}
