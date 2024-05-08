package NhanVien;

public class NhanVienPart extends NHANVIEN {
    private int Giolamvien;

    public void NhanVienPartTime(String Ten, int Giolamvien) {
        this.Ten = Ten;
        this.Giolamvien = Giolamvien;
    }

    public void LoaiNhanVien(String LoaiNhanVien) {
        this.LoaiNhanVien = LoaiNhanVien;
    }

    public void TinhLuong() {
        Luong = confit.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * Giolamvien;
    }

    @Override
    public void InTT() {
        super.InTT();
    }
}
