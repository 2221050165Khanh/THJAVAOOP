import java.util.Scanner;

public class Slide74Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gia tri mang :");
        int n;
        do {
            n = sc.nextInt();
        } while (n < 0);
        System.out.print("Nhap gia tri cac phan tu :");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        // Tinh tong
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.print("Tong cua cac so chan : " + sum);
    }
}
