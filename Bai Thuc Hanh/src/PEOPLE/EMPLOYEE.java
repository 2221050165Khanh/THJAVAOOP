package PEOPLE;

import java.util.Scanner;

public class EMPLOYEE extends PERSON {
    public String MaNhanVien;
    public int DayStartwork;
    public float Luong;
    public float ThuNhap;
    public int DayEndwork;
    public int SoNgayCong;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(String MaNhanVien) {
        super.NhapThongTin();

    }

    public int NhapNgayBD() {
        System.out.println("Nhap Nhap Ngay Bat dau lam :");
        do
            DayStartwork = sc.nextInt();
        while (DayStartwork < 0 && DayStartwork > 30);
        return DayStartwork;

    }

    public int NhapNgayKT() {
        System.out.println("Nhap Nhap Ngay Ket thuc lam :");
        do
            DayEndwork = sc.nextInt();
        while (DayEndwork < 0 && DayEndwork > 30);
        return DayEndwork;
    }

    public int NgayCong() {
        if (DayStartwork > DayEndwork) {
            SoNgayCong = DayEndwork + (30 - DayStartwork);
        } else if (DayStartwork < DayEndwork) {
            SoNgayCong = DayEndwork - DayStartwork;
        } else
            SoNgayCong = DayStartwork;
        return SoNgayCong;
    }

}
