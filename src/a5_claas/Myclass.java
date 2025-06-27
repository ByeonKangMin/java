package a5_claas;

public class Myclass {
    public static void main(String[] args) {
        Student steve = new Student("steve",25);
        Student tom = new Student();
        Student sam = new Student("sam",29,"대전","남자",100,90,80);
        System.out.println(steve.name);
        System.out.println(tom.name);
        System.out.println(sam.name);
        tom.name = "tom";
        tom.age = 21;
        System.out.println(tom.name + " "  + tom.age);

        //성적조회
        double sumScoreSam = sam.sumScore(); //메서드의 호출
        System.out.println(sumScoreSam);
        double averageScoresam = sam.averageScore();
        System.out.println(averageScoresam);
        //★ 정보를 알고 싶으면 정보를 담고있는 객체의 메서드를 호출해야함 <(.)의 역할>

       Book book = new Book("해리포터"," by j.k.롤링",", 14000원");
        System.out.println(book.title + book.author + book.price);

    }
}
