
import java.util.Scanner;

public class Slide81Chuong2 {
    public static void main(String[] args) {
        System.out.print("So cot va so dong:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        System.out.print("Nhap gia tri mang 2 chieu ");
        int max = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                System.out.println("Nhap gia tri cua A[" + x + "] va [" + y + "]");
                A[x][y] = sc.nextInt();
                if (A[x][y] > max) {
                    max = A[x][y];
                }
            }
        }
        sc.close();
        System.out.print("So lon nhat trong mang la :" + max);

    }
}
