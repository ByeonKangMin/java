package a6_array;

public class Example2 {
    public static void main(String[] args) {
        //주어진 배열의 평균값을 계산하는 메서드 //답30.0
        int[]numbers = {10,20,30,40,50};
        double average = getAverage(numbers);
        System.out.println(average);
    }
    public static double getAverage(int[]arr){
        int sum = 0;
        for (int data : arr){
            sum = sum + data;
        }
        double averdge = (double) sum / arr.length;
        return averdge;
    }
}
