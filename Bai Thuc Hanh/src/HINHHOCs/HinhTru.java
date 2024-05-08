package HINHHOCs;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float ChieuCao;

    public void HinhTruj() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hinh Hoc : ");
        Name = sc.nextLine();
        sc.close();
    }

    public void NhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hinh Hoc : ");
        ChieuCao = sc.nextFloat();
        sc.close();
    }

    public void TinhTheTich() {
        TheTich = PI * BK * BK * ChieuCao;
    }

}
