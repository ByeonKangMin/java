package a6_array;

public class Example1 {
    public static void main(String[] args) {
        //배열연습
        //랜덤한 정수 10개를 가진 배열에서 특정 값을 찾고 그 위치에 인덱스 값을 리턴하는 메서드
        //찾지 못하면 -1리턴

        int[] numbers = {37,82,14,56,91,23,48,65,8,74};
        int found = findNumber(numbers,56);
        System.out.println(found);
        found = findNumber(numbers,100);
        System.out.println(found);
    }
    public static int findNumber(int[]numbers, int target){
        int index =0;
        for(int data : numbers){
            if(data == target) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
