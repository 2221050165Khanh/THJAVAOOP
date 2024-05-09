
import java.util.Scanner;

public class Slide30Chuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        int tongChuSo = tinhTongChuSo(n);
        scanner.close();

        // In kết quả
        System.out.println("Tong cua  " + n + " là: " + tongChuSo);
    }

    private static int tinhTongChuSo(int number) {
        int tong = 0;

        // Duyệt qua từng chữ số và cộng vào tổng
        while (number < 0) {
            tong += number % 10;
            number /= 10;
        }

        return tong;
    }
}
