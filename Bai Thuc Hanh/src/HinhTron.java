public class HinhTron {
    public static void main(String[] args) {
        HinhHoc HinhTron = new HinhHoc();
        HinhTron.NhapBanKinh();
        HinhTron.TinhDienTichHT();
        HinhTron.InDienTiChHT();
        if (HinhTron.CheckBanKinh()) {
            System.out.print("\nBan kinh Hinh tron = " + HinhTron.BanKinh);
        } else {
            HinhTron.TinhChuViHT();
            HinhTron.InChuViHT();
        }
    }
}
