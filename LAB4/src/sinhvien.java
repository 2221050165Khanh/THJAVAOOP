import java.util.Scanner;
public class sinhvien {
    public String ten;
    public int diem;
    public void nhapTen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem: ");
        diem = sc.nextInt();
    }
    public void InThongTin()
    {
        System.out.println("Ten: " + ten);
        System.out.println("Diem: " + diem);
        System.out.println("-----------------------");
    }
}