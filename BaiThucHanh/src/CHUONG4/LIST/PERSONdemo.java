package CHUONG4.LIST;
import java.util.Scanner;

public class PERSONdemo {
    public String Fullname;
    public int ID;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin :");
        Fullname = sc.nextLine();
         ID = sc.nextInt();
        sc.close();
    }

    public void InThongTin() {
        System.out.print("\nTen :" + Fullname);
        System.out.print("\nID :" + ID);
        System.out.print("\n");
    }
}
