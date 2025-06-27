package a4_method;

import java.util.SplittableRandom;

public class Method1 {
    public static void main(String[] args) {
        //문자열에서 특정 문자의 위치를 찾는 코드
        String name= "steve";
        char ch = 'x';
        findCharacter(name, ch); // 문장안에서 특정 문자를 찾는 함수

        int number = 3;
        checkOddEven(number); // 숫자를 주면 짝수인지 홀수인지 알려주는 함수

        int bignumber = 9999999;
        int basenumber = 3;  // 베이스 숫자의 배수인지 여부를 알려주는 함수
        checkMultipleOf(bignumber,basenumber);
    }

    //메서드의 위치는 클래스의 자식
    //다른 메서드안에 만들지 말 것
    //메서드의 기본형태 : public  리턴형 메서드이름 (매개변수1, 매개변수2,...){}
    //메서드의 이름의 첫 시작은 소문자로 시작
    //동사+명사 (권장사항)
    public static void findCharacter(String name,char ch) {
        int index = -1;
        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
            if (name.charAt(i)==ch) {
                index = 1;
                break;
            }
        }
        if (index==-1) {  //못찾았다는 의미
            System.out.println("찾을 수 없습니다.");
        }else {
            System.out.println("위치는 ="+index);
        }
    }

    public static void checkOddEven(int number) {
        String str = (number%2==0) ? "짝수" : "홀수";
        System.out.println(str);
    }

    public static void checkMultipleOf(int number, int base) {
        boolean isMultiple = (number%base ==0)? true : false;
        System.out.println(base + "의 배수 : " + isMultiple);
    }
}
