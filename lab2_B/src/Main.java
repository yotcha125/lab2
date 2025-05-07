public class Main {
    public static void main(String[] args) {
        int N = 5;
        int i = N;

        do {
            int j = i;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= N);
            System.out.println();
            i--;
        } while (i >= 1);

        i = 2;
        do {
            int j = i;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= N);
            System.out.println();
            i++;
        } while (i <= N);
    }
}