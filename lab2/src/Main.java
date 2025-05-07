public class Main {
    public static void main(String[] args) {
        int N = 5;
        int i = 1;

        while (i <= N) {
            if (i % 2 == 1) {
                int j = i;
                while (j >= 1) {
                    System.out.print(j);
                    j--;
                }
            } else {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}