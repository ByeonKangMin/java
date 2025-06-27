package a6_array;

public class Example3 {
    public static void main(String[] args) {
        //중복된 숫자의 갯수를 리턴하는 메서드
        int[] numbers = {1,3,7,2,4,3,9,8,3,4,};
        int count = countNumber(numbers,3);
        System.out.println(count);
        count = countNumber(numbers,10);
        System.out.println(count);
    }
    public static int countNumber(int[]numbers, int target) {
        int index = 0;
        for (int data : numbers) {
            if (data == target) {
                index++;
            }
        }
        return index;
    }
}
