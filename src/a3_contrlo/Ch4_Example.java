package a3_contrlo;

public class Ch4_Example {
    public static void main(String[] args) {
       //Q1
        int score = 72;
        if (score >= 80 && score <= 90) {
            System.out.println("B학점");
        }
        else if (score >= 90) {
                System.out.println("A학점");
            } else if (score >= 70 && score <= 80) {
                System.out.println("C학점");
            } else {
                System.out.println("F학점");
            }

        //Q2
        //switch case는 범위조건을 구현하기에 부적함
        //점수를 10으로 나눠서 앞자리로 구분하는 방법 사용
        switch (score/10) {
            case 10:
            case 9:
            System.out.println("A확점");break;
            case 8:
            System.out.println("B확점");break;
            case 7:
            System.out.println("C확점");break;
            default:
                System.out.println("F확점");
        }
    }
}