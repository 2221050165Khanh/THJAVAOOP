import java.util.Scanner;

public class Slide95Bai6Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int giaithua = 1;
        for (int i = n; i > 0; i--) {
            giaithua *= i;
        }
        System.out.print("Giai thua cua " + n + " la:" + giaithua);
    }
}
