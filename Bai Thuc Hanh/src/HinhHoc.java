import java.util.Scanner;

public class HinhHoc {

    final float PI = 3.14f;
    public float BanKinh;
    public float ChuViHT, ChuViHCN;
    public float DienTiChHT, DienTiChHCN;
    public float ChieuDai, ChieuRong;
    Scanner sc = new Scanner(System.in);

    // Khai bao phuong thuc
    public void NhapBanKinh() {
        System.out.print("Nhap R = ");
        BanKinh = sc.nextFloat();
    }

    public void Nhap() {
        System.out.print("Nhap Chieu Dai =");
        ChieuDai = sc.nextFloat();
        System.out.print("Nhap Chieu Rong =");
        ChieuRong = sc.nextFloat();
    }

    public void TinhChuViHT() {
        ChuViHT = 2 * PI * BanKinh;
    }

    public void TinhDienTichHT() {
        DienTiChHT = PI * BanKinh * BanKinh;
    }

    public void InChuViHT() {
        System.out.print("\nChu Vi = " + ChuViHT);
    }

    public void InDienTiChHT() {
        System.out.print("\nDienTich = " + DienTiChHT);
    }

    public float getBanKinh() {
        return BanKinh;
    }

    public float TinhChuViHCN(float cd, float cr) {
        ChuViHCN = (cd + cr) * 2;
        return ChuViHCN;
    }

    public float TinhChuViHCN() {
        ChuViHCN = (ChieuDai + ChieuRong) * 2;
        return ChuViHCN;
    }

    public float TinhdDienTiChHCN(float cd, float cr) {
        DienTiChHCN = (cd * cr);
        return DienTiChHCN;
    }

    public float TinhdDienTiChHCN() {
        DienTiChHCN = ChieuDai * ChieuRong;
        return DienTiChHCN;
    }

    public void InHCN() {
        System.out.print("\nChu Vi HCN= " + ChuViHCN);
        System.out.print("\nDien Tich HCN= " + DienTiChHCN);
    }

    public boolean CheckBanKinh() {
        if (BanKinh > 10)
            return true;
        else
            return false;
    }
}