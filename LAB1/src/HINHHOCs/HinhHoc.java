package HINHHOCs;

public class HinhHoc {
    final float PI = 3.14f;
    public String Name;
    public float ChuVi;
    public float DienTich;
    public float TheTich;

    public void XuatTen() {
        System.out.print("Ten Hinh Hoc: " + Name);
    }

    public void inChuVi() {
        System.out.print("Chu Vi Hinh:" + Name + "= " + ChuVi);
    }

    public void inDienTich() {
        System.out.print("Dien Tich Hinh:" + Name + "= " + DienTich);
    }

    public void inTheTich() {
        System.out.print("The Tich Hinh:" + Name + "= " + TheTich);
    }
}
