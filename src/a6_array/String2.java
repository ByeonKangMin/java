package a6_array;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        //1. 문자열 길이 length()
        String str1 = "Hello java!";
        String str2 = "안녕하세요 반갑습니다";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        //2. 문자열 검색 charAt(), indexOf(), lastIndexOf()
        //   indexOf => 단어도 찾아줌, 대신 시작지점만 알려줌, 대.소문자 구별함
        System.out.println(str1.charAt(1));              //e
        System.out.println(str2.charAt(1));              //녕
        System.out.println();
        System.out.println(str1.indexOf('a'));          //7
        System.out.println(str1.lastIndexOf('a'));      //9
        System.out.println(str1.indexOf('a',8));        //9
        System.out.println(str1.lastIndexOf('a',8));    //7
        System.out.println(str1.indexOf("java"));       //6
        System.out.println(str1.indexOf("Java"));       //-1 검색실패
        System.out.println();


        //3. 문자열의 변환 및 연결 valueOf(), concat()
        //  String.valueOf() = Integer.toString(), Double.toString(), Boolean.toString()
        // concat : 문자를 가공할 때 사용?
        String str3 = String.valueOf(2.3);      //double => String  <Double.toString()>
        String str4 = String.valueOf(false);    //boolean => String <Boolean.toString()>
        System.out.println();
        String str5 = str3.concat(str4);
        System.out.println(str5);
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println(str6);
        System.out.println(str7);

        //4. 문자열 -> byte[] or char[]
        //문자열을 바이트의 배열로 만드는 이유 -> 네트워크전송, 파일 입＊출력
        //ex)hello = 2byte*5 = 10byte => byte[]로 바꾸면 5byte로 ↓
        //char배열로 만드는 이유 -> 문자의 검색, 수정에 사용
        String str8 = "Hello Java";
        String str9 = "안녕하세요";
        byte[]array1 = str8.getBytes();
        byte[]array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        //한글의 문자인코딩(character encoding) 방식
        //자바가 내부적으로 사용하는 방식은 UTF-16 (2byte)
        //윈도우 오피스가 사용하는 방식은 EUC-KR (2byte)
        //가장 널리 사용되는 글로벌표준 방식은 UTF-8 (3byte) => 가변적으로 변함
        //한글은 최소 2바이트가 필요함
        //array2의 byte[]가 15글자로 표현되는것으로 보아 UTF-8울 사용함
        System.out.println();

        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        //String은 불변성을 가지므로 수정할 수 없음
        //String을 char[]로 변경해서 수정하거나 검색하는데 용이하도록 사용
    }
}
