
import java.util.Scanner;

public class 作业4 {


    public static void main(String args[]) {

        int[] all = new int[8];
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请在键盘上输入8个数字：");
        for (int i = 0; i < all.length; i++) {
            all[i] = sc.nextInt();
        }
        for (int j = 0; j < 8; j++) {

            if (all[j] % 2 == 0) {
                a++;
                int[] single = new int[a];
                for (int k = 0; k < a; k++) {
                    single[k] = all[j];
                }
            } else {

                b++;
                int[] twofold = new int[b];
                for (int l = 0; l < b; l++) {
                    twofold[l] = all[j];
                }
            }

        }

        System.out.println("偶数的个数为" + a);
        System.out.println("奇数的个数为" + b);
        int r = 0;
        int t = 0;
        for (int p = 0; p < 8; p++) {

            if (p % 2 == 0) {

                System.out.print(single[r]);
                r++;
            }
            {
                if (p % 2 == 1) {
                    System.out.print(twofold[t]);
                    t++;
                }
            }
        }


        if (a > b) {
            for (int m = 0; m < a - b; m++) {

                System.out.print(single[m]);
            }
        } else if (a < b) {
            for (int n = 0; n < b - a; n++) {

                System.out.print(single[n]);
            }


        }

    }
}

