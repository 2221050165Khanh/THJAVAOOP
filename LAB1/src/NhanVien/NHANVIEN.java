package NhanVien;

public class NHANVIEN {
    public String Ten;
    public Long Luong;
    public String LoaiNhanVien;

    public void NhanVien() {
    }

    public void NhanVien(String Ten) {
        this.Ten = Ten;
    }

    public String LoaiNhanVien() {
        return "";
    }

    public void InTT() {
        System.out.println("     TEN : " + Ten);
        System.out.println("   Loai Nhan Vien : " + LoaiNhanVien);
        System.out.println("   Luong : " + Luong + " VND");

    }

}
