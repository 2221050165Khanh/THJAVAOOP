package NhanVien;

import java.util.Scanner;

public class NhanVienFULL extends NHANVIEN {
    public int DayWork;
    public int loaiChucVU;
    Scanner sc = new Scanner(System.in);

    public void NhanvienFullTime(String Ten) {
        this.Ten = Ten;
    }

    public void NhanvienFullTime(String Ten, int DayWork) {
        this.Ten = Ten;
        this.DayWork = DayWork;
    }

    public void SetloaiChucVu(int loaiChucVU) {
        this.loaiChucVU = loaiChucVU;
    }

    public void LoaiNhanVien(String LoaiNhanVien) {
        this.LoaiNhanVien = LoaiNhanVien;
    }

    public void TinhLuong() {
        if (loaiChucVU == 1) {
            Luong = confit.LUONG_NHAN_VIEN_SEP + confit.LUONG_LAM_THEM_MOI_NGAY * DayWork;
        } else
            Luong = confit.LUONG_NHAN_VIEN_LINH + confit.LUONG_LAM_THEM_MOI_NGAY * DayWork;
    }

    @Override
    public void InTT() {
        super.InTT();
    }
}
