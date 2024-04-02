package HINHHOCs;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float Dai;
    public float Rong;

    public void HinhchuNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hinh Hoc : ");
        Name = sc.nextLine();
        sc.close();
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Chieu Dai = ");
        Dai = sc.nextFloat();
        System.out.print("Nhap Chieu Rong = ");
        Rong = sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi() {
        ChuVi = (Dai + Rong) * 2;
    }

    public void tinhDienTich() {
        DienTich = Dai * Rong;
    }
}
