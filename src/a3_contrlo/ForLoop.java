package a3_contrlo;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //반복제어문 For
        //기본형태
        //for (초기식; 조건식; 증감식;) {
        //    실행구문
        //}
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println("반복끝");
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println("반복끝");

        //컴파일에러가 발생하지 않지만 무한루프에 빠지게 되므로 사용x
        //무한루프를 설계해도
        for (; ; ) {
            System.out.println("무한루프");

            //증감식의 변화 (2씩 증가)
            for (int i = 0; i < 10; i = i + 2) {
                System.out.print(i);
            }
            System.out.println("반복끝");

            //interator(=반복자)여러개인 경우
            for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
                System.out.println(i + "" + j);
            }
        }
    }
}
