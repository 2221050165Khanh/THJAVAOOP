import java.util.Scanner;

public class Slide47Chuong2 {
    public static void main(String[] args) {
        int a, sum = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        do {
            System.out.println("Nhap cac so  ");
            a = scanner.nextInt();
            sum += a;
        } while (sum < 100);
        System.out.println("Tong cac so vua nhap = " + sum);
    }
}
