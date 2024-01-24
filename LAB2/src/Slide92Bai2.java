import java.util.Scanner;

public class Slide92Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap gia tri n=");
        n = scan.nextInt();
        scan.close();
        if (n % 2 == 0)
            System.out.println("n la so chan");
        else
            System.out.println("n la so le");

    }
}
