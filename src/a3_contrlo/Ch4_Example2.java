package a3_contrlo;

public class Ch4_Example2 {
    public static void main(String[] args) {
      // Q3
       for (int i=0; ; i++) {
            if (i>10){
                break;
            }
            if (i%2==1) {
                continue;
            }
            System.out.println(i);
        }

       //Q4
        int i=10;
        while (i>0) {
            System.out.println(i);
            i-=2;
        }

        //Q5
        for (int k=0; k<5; k++) {
            for (int j=0; j<3; j++) {
                if (k==2) {
                    continue;
                }
                if (j==1) {
                    break;
                }
                System.out.println("A");
            }
        }

        //Q6
        for (int k=0; k<10; k++){
                for (int j = 0; j < 5; j++) {
                    if (k==3 && j==2) {
                        k=999999;
                        break;
                    }
                    System.out.println("K=" + k + ", j=" + j);
                }

        }

        //Q7 레이블
        out :
        for (int k=0; k<10; k++){
            for (int j = 0; j < 5; j++) {
                if (k==3 && j==2) {
                    break out;
                }
            }
        }


    }
}
