import java.util.Scanner;

public class Slide92Bai1 {
    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So Thu 1 : ");
        num1 = sc.nextInt();

        System.out.println("Nhap So Thu 2: ");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;
        System.out.println("Tong hai so =: " + sum);
        int hieu = num1 - num2;
        System.out.println("Hieu 2 so =" + hieu);
        int Tich = num1 * num2;
        System.out.println("Tich 2 so =" + Tich);
        float thuong, thuongdu;
        thuong = num1 / num2;
        thuongdu = num1 % num2;
        System.out.println("Thuong 2 so =" + thuong);
        System.out.println("Thuong du 2 so =" + thuongdu);
        if (num1 != num2) {
            if (num1 > num2)
                System.out.println("gia tri so " + num1 + "> gia tri so " + num2);
            else
                System.out.println("gia tri so " + num1 + "< gia tri so " + num2);
        } else
            System.out.println("gia tri so " + num1 + "= gia tri so " + num2);

    }
}