package a5_claas;

public class Book {
    String title;
    String author;
    String price;

    public Book() {}

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String setTitle(String newTitle){
        this.title = newTitle;
        return this.title;
    }
    public String setAuthor(String newAuthor){
        this.author = newAuthor;
        return this.author;
    }
    public String setPrice(String newPrice){
        this.price = newPrice;
        return this.price;
    }

    //메서드 오버로딩(Overloding)이란?
    //메서드의 이름을 동일하게 유지하면서 메서드 시그니처를 다르게하여
    //여러 다른 기능을 메서드가 수행하도록 하는 기법
    //메서드 시그니처 = 메서드이름, 매개변수 자료형, 매개변수의 갯수
    public  void method1(int a, String b) {
    }
    public  void  method1(String c, int d){
        //메서드 이름이 같지만 매개변수의 자료형이 다르므로 서로 다른 메서드로 인식
    }
    public  void method1(int a, String b, boolean c) {
        //메서드 이름이 같지만 메서드 매개변수의 갯수가 다르므로 서로 다른 메서드로 인식
    }

    //메서드 오버로딩은 왜 사용하는가?
    //동일한 이름과 기능을 가진 메서드가 여러가지 형태의 매개변수를 사용가능하게 만들어서 메서드의 사용성을 높임
    //개발자는 하나의 메서드 이름만 기억하고 여러가지 방법으로 사용할 수 있음
    //ex) println 메서드

}