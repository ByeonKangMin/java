package a6_array;

import a5_claas.Student;

public class Array4     {
    public static void main(String[] args) {
        //반복문을 사용한 배열의 순회

        //배열의 길이
        int[] numbers = {3,4,5,6,7};
        System.out.println("배열의 길이=" + numbers.length);

        //배열의 순회
        //방법.1
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        //방법.2 (추천)
        for (int data : numbers) {
            System.out.println(data);
        }

        //연습예제
        String[] colors = {"검정","흰색","파랑","빨강","초록"};
        for(String data : colors){
            System.out.println(data);
        }
        Student[] students = new Student[3];
        students[0] = new Student("steve",25,"대전","남",100,100,100);
        students[1] = new Student("tom",21,"서울","남",90,80,70);
        students[2] = new Student("laura",23,"대구","여",95,85,75);

        for (Student data : students) {
            System.out.println(data);
        }
    }
}
