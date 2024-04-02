package PEOPLE;

import java.util.Scanner;

public class EMPLOYEEfullTime extends EMPLOYEE {
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin() {
        super.NhapThongTin(MaNhanVien);
    }

    public void NhapLuongFullTime() {
        System.out.println("Nhap Luong theo gio:");
        Luong = sc.nextFloat();
    }

    public void TinhLuong() {
        ThuNhap = SoNgayCong * Luong;
    }

    public void InThongTin() {
        super.InThongTin();
        System.out.println("\nMa so nhan vien " + MaNhanVien);
        System.out.println("\nThu nhap  " + ThuNhap);
    }

}
