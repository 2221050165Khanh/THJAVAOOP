package HINHHOCs;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public void HinhVuongo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hinh Hoc : ");
        Name = sc.nextLine();
        sc.close();
    }

    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Canh : ");
        Dai = sc.nextFloat();
        sc.close();
    }
}
