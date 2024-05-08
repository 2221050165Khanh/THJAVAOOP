import java.util.Scanner;

public class Slide35Chuong2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri a=");
        a = sc.nextInt();
        System.out.print("Nhap vao gia tri b=");
        b = sc.nextInt();
        sc.close();
        if (a > b)
            System.out.println("So nho nhat trong 2 so  " + a + " và " + b + "là " + b);
        else if (a < b)
            System.out.println("So nho nhat trong 2 so  " + a + " và " + b + "là " + a);
        else
            System.out.print("Hai so bang nhau");
    }
}
