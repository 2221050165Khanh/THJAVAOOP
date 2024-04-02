package PEOPLE;

public class BangKeToan {
    public static void main(String[] args) {
        EMPLOYEEfullTime NhanVien1 = new EMPLOYEEfullTime();

        NhanVien1.NhapLuongFullTime();

        NhanVien1.NhapNgayBD();
        NhanVien1.NhapNgayKT();
        NhanVien1.NhapThongTin("MS001");
        NhanVien1.NgayCong();
        NhanVien1.TinhLuong();
        NhanVien1.InThongTin();

    }
}