package PEOPLE;

import java.util.Scanner;

public class EMPLOYEEpartTime extends EMPLOYEE {
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin() {
        super.NhapThongTin(MaNhanVien);
    }

    public void NhapLuongPartTime() {
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
