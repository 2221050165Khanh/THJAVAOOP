import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
        sc.close();
        PhuongTrinhBac2.GiaiPhuongTrinh(a, b, c);
    }

    public static void GiaiPhuongTrinh(int a, int b, int c) {
        if (a == 0) {
            if (b == 0)
                System.out.println("PT vo so nghiem");
            else
                System.out.println("PT co 1 nghiem la :" + (-c / b));
            return;
        }
        float delta, nghiem1, nghiem2;
        delta = b * b - 4 * a * c;
        if (delta > 0) {
            nghiem1 = (float) (-b + Math.sqrt(delta) / 2 * a);
            nghiem2 = (float) (-b - Math.sqrt(delta) / 2 * a);
            System.out.println("PT có nghiem la :" + nghiem1 + " va " + nghiem2);
        }

        else if (delta == 0) {
            System.out.println("PT co nghiem kep la :" + (-b / 2 * a));
        } else
            System.out.println("PT vo nghiem ");
    }

}
