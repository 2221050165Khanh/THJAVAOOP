import java.util.Scanner;

public class Slide97Bai11Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu :");
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri A[" + i + "]:");
            A[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
