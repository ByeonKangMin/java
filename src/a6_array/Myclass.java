package a6_array;

import java.util.Objects;

public class Myclass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        double area = r.getArea();
        System.out.println("면적은" + area);
        double perimeter = r.getPerimeter() ;
        System.out.println("둘레는" + perimeter);
        //크기 재설정
        r.resize(new double[]{4,5});
        //=>double [] array = new double[2]
        //array1 = 4;
        //array2 =[5];
        area = r.getArea();
        System.out.println("면적은" + area);
        perimeter = r.getPerimeter() ;
        System.out.println("둘레는" + perimeter);
    }
}
