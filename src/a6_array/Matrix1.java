package a6_array;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
        // 2차원 행렬 배열 = 매트릭스, 2D Array
        // 2차원 배열의 선언
        int [][] array1 = new int [3][4];
        //int [] array1[] = new int [3][4];     잘 안쓰는 방법
        //int array1[][] = new int [3][4];          "

        // 2차원 배열의 값 대입
        int[][] array3 = new int[2][3];     //2*3=6 개의 data가 있는 배열
        array3[0][0] = 1;                   // 스택
        array3[0][1] = 2;                   // int[][]array3 = A
        array3[0][2] = 3;
        array3[1][0] = 4;                   // 힙
        array3[1][1] = 5;                   // A : [0] = B열   [1] = C열
        array3[1][2] = 6;                   // B : [0] = 1    [1] = 2     [2] = 3
                                            // C : [0] = 4    [1] = 5     [2] = 6
        //리터럴 방식으로 생성 (new를 사용하지 않고 생성)
        int[][]array4 ={{1,2,3},{4,5,6}};

        // 2차원 배열 출력 (deepTostring)
        System.out.println(Arrays.deepToString(array3));
        System.out.println(array3.length);      //2
        System.out.println(array3[0].length);   //3
        System.out.println(array3[1].length);   //3
        for (int i=0; i<array3.length; i++){
            for (int j=0; j<array3[i].length; j++){
                System.out.println(array3[i][j]);
            }
        }

    }
}
