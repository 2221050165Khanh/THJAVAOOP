import java.util.Scanner;

public class Slide95Bai8Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int n = sc.nextInt();
        int dem = 0, sum = 0, a[] = new int[n];
        sc.close();
        System.out.print("Nhap gia tri phan tu mang:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem++;
            sum += a[i];
        }
        System.out.print("Gia tri trung binh :" + (sum / dem));
    }
}
