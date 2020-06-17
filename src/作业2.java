public class 作业2 {
    public static void main(String args[]) {
        int sum=2;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j >= (i - 1)) {
                    sum += i;
                }

            }

        }System.out.print("1-100质数之和为"+sum);
    }
}