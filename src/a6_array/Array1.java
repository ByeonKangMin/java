package a6_array;

// 같은 패키지에 있는 클래스가아니므로 import 해야함
//public 클래스라 하더라도 다른 패키지에 있으면 import해야만 사용할 수 있다
//public의 의미가 누구나 import할 수 있다는 의미이지,
//어디에 있는지 자동으로 찾는다는 의미는 아님!
import a5_claas.Student;    //패키지를 입력해줘야 함(util, a5_class...)

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //배열 = array
        //자료구조 = (Data Structure)중에서 가장 단순한 구조
        //자료구조 종류 : 배열, 리스트, 세트, 맵, 트리...

        //배열의 선언
        //한줄 선언
        int [] array1 = new int[3]; //int형 자료 3개를 힙 영역에 생성
        //두줄 선언
        double[] array2;
        array2 = new double[5]; //double형 자료 5개를 힙 영역에 생성
        //배열의 특징 : 생성시에 크기를 결정하고 이를 늘리거나 줄일 수 없다!//
        // 만약 array2의 크기를 6개로 늘리려면 새로 6개를 만들고 기존 배열은 삭제함

        //모든 자료형을 배열로 만들 수 있음(참조자료형 포함)
        //String[] array3 = new String[10];
        //Student[] students = new Student[100];

        //<배열에 값을 대입하는 법>
        array1[0] = 0;
        array1[1] = 10;
        array1[2] = 20;
        //array1[3] = 30; //에러 ==>index 초과

        //<화면출력>
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
        System.out.println(Arrays.toString(array1));
        //배열의 출력 메서드(toString)을 사용하면 쉽게 전체 데이터를 확인 가능

        //배열의 초기값 정리
        //배열은 힙 메모리에 생성되므로 기본자료형의 경우, 각자의 초기값을 갖는다
        //char char = null
        //boolean bool = false
        //int i = 0 (byte, short, int, long)
        //double num = 0.0 (float, double)
        String[] array3 = new String[10];
        Student[] students = new Student[5];
        array3[0] = "첫번째";
        array3[1] = "두번째";
        System.out.println(Arrays.toString(array3));

        //student 클래스의 배열에 값을 저장하는 방법
        students[0] = new Student("steve",25,"대전","남",100,100,100);
        students[1] = new Student("tom",21,"서울","남",90,80,70);
        students[2] = new Student("laura",23,"대구","여",95,85,75);
        System.out.println(Arrays.toString(students));
        //클래스안에 toString 메서드를 오버라이드해야만 정상적인 출력 가능.
    }
}
