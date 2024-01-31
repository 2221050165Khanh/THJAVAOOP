import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double Nghiem;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        sc.close();
        Nghiem = -b / a;
        if (a == 0 && b == 0)
            System.out.println("PT vo so nghiem ");
        if (a == 0 && b != 0)
            System.out.println("PT vo nghiem ");
        if (a != 0)
            System.out.println("Nghiem cua phuong trinh " + Nghiem);
    }
}
