package HINHHOCs;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float BK;

    public void HinhTronf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hinh Hoc : ");
        Name = sc.nextLine();
        sc.close();
    }

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh BK= ");
        BK = sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi() {
        ChuVi = PI * BK;
    }

    public void tinhDienTich() {
        ChuVi = PI * BK * BK;
    }
}
