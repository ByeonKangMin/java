package a6_array;

public class String1    {
    public static void main(String[] args) {
        //String 클래스는 문자의 순서, 문자열을 나타내는 객체
        //공식정으로 배열로 부르지는 않는다
        //내부적로 char의 배열 모습을 하고 있음
        //배열과 유사한 특징을 가지지만 원칙적으로 불변성(immutable)을 가짐

        //숫자 -> 문자열(String)
        int a = 10;
        String str1 = Integer.toString(a);
        System.out.println(str1);   //문자 10
        double b = 5.5;
        String str2 = Double.toString(b);
        System.out.println(str2);   //5.5문자
        boolean c = true;
        String str3 = Boolean.toString(c);
        System.out.println(str3);   //true문자

        //기본자료형의 래퍼(Wrapper)클래스.    =>감싸다의 의미
        //Byte, Short, Integer, Long, Float, Double, Character, Boolean
        //모든 기본자료형과 1대1로 대응됨
        //불변성을 가짐 (수정x)
        //생성자를 사용하지 않고 대신 valueOf()메서드를 사용하여 객체 생성

        //래퍼 클래스의 사용
        //#1 자료구조중에 높은 성능을 나타내는 컬렉션(리스트,세트,맵,트리...)들은
        //   모두 객체를 저장하도록 설계도되어있기 때문에 기본자료형을 다루기 어렵다
        //   기본자료형을 래퍼클래스로 감싸서 자료구조에 사용함
        //#2 유용한 메서드를 제공 : 타입변환, 비교연산등 유용한 메서드를 제공
        //   별도의 외부메서드 없이 내부에 포함된 유용한 메서드를 쉽게 사용 가능
        //#3 제네릭(Generics) : class MyClass<t> { }
        //   T를 제네릭이라 부르고 T는 모든 객체를 대표하는 키워드
        //   T자리에 어던 클래스도 사용될 수 있도록 다양성을 추가한 문법

        // 문자열 -> 숫자
        int aa = Integer.parseInt(str1);
        System.out.println(aa);     //숫자 10
        double bb = Double.parseDouble(str2);
        System.out.println(bb);     //숫자 5.5
        boolean cc = Boolean.parseBoolean(str3);
        System.out.println(cc);     //true

        //valueOf를 이용한 타입변환
        //래퍼클래스의 생성자를 대신함
        //메서드의 반환 결과는 기본자료형이 아닌 래퍼클래스
        Integer aaa = Integer.valueOf(str1);
        System.out.println(aaa);
        Double bbb = Double.valueOf(str2);
        System.out.println(bbb);
        Boolean ccc = Boolean.valueOf(str3);
        System.out.println(ccc  );
        //일반적인 계산 목적으로 타입면환을 할때는 사용x
        //컬렉션(리스트,세트,맵,트리...)에 사용할 목적으로 주로 사용
    }
}
