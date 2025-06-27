package a5_claas;

public class Student {
    //내부구성요소
    //#1. 필드
    String name;
    int age;
    String address;
    String gender;
    double scoreMath;
    double scoreHistory;
    double scoreMusic;

    //#2.생성자 :필드영역을 초기화 하는 역할, new 뒤에 사용
    //          클래스의 이름과 같아야함
    //#2-1.기본생성자
    public Student() {
    }

    //#2-2.매개변수가 있는 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address, String gender, double scoreMath, double scoreHistory, double scoreMusic) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scoreHistory = scoreHistory;
        this.scoreMusic = scoreMusic;
    }

    //생성자와 메서드의 차이점
    // 목적 : 생성자는 필드의 초기화 역학, 메서드는 기능 구현 역할
    // 이름 : 생성자는 클래스와 동일, 메서드는 동사(동사+명사)로 시작
    // 반환형 : 생성자는 반환형x, 메서드는 반드시 명시(void, int, String등)

    //#3.메서드

    @Override //부모의 메서드를 자식이 수정했다는 의미. 자식만 가지고있는 메서드에는 안붙음
    public String toString() {
       // return super.toString(); => super는 부모 클래스인 Object 클래스
        return this.name;  //반환하는 값은 각 클래스에 맞춰 작성
    }

    public double sumScore() {
        double sum = this.scoreMath + this.scoreHistory + this.scoreMusic;
        return sum;
    }

    public double averageScore() {
        double sum = sumScore(); // 메서드에는 this를 대부분 생략함
        double average = sum / 3;
        return average;
    }

    //public String setName(String newName) {}
        //★클래스의 필드를 직접 수정하면 각 필드의 특징을 거스르는 값이 저장될 수있음
        // ex)숫자가 포함된 이름과 같이 문법적으로는 문제없으나 이름에는 적절하지 못함
        //그러므로 필드에 직접 수정하는 방식을 막고 메서드를 통한 수정박식을 선호함
        //==>이것을 클래스의 은닉화(Capsuliztion)이라고 함

        //if (문자열안에 숫자가 포함되어 있다면) {
        // System.out.println("에러발생");
        // } else if (빈문자열이라면) {
        // System.out.println("에러발생. 이름이 없음.");/
        // 예외발생
        //this.name = newName;
        //return this.name;
    }

    //<클래스>
    //1. 기본자료형의 한계 극복
    //: 단일형태의 자료만 저장가능한 기본자료형과는 달리
    //여러 종류의 기본자료형을 묶어서 하나의 새로운
    //복합적인 자료형(데이터타입)을 정의하는 것
    //=> 구조체의 특징과 동일함

    //2. 메서드를 추가
    //: 단순히 데이터를 묶는 것을 넘어, 해당 데이터와 관련된
    //행위(=메서드)를 함께 정의함.
    //예를 들어 학생의 평균점수 계산하는 메서드를 함께 관리.

    //3. 상속개념 추가
    //: 유사한 정보를 담고 있는 클래스들을 효율적으로 관리하기
    //위해 공통의 정보는 부모클래스가 가지고 고유의 정보는 자식
    //클래스가 가지도록 클래스를 상하구조로 나누는 상속의 개념
    //을 도입
    //예를 들어 직원클래스(부모) - 정직원,계약직,아르바이트
