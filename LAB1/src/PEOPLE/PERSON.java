package PEOPLE;

import java.util.Scanner;

public class PERSON {
    public String Name;
    public String ADDRESS;
    public String Date;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap  TEN:");
        Name = sc.nextLine();
        System.out.print("Nhap  NGAY SINH:");
        Date = sc.nextLine();
        System.out.print("Nhap DIA CHI:");
        ADDRESS = sc.nextLine();
        sc.close();
    }

    public void InThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nName :" + Name);
        System.out.print("\nNgày Sinh :" + Date);
        System.out.print("\nĐia chi :" + ADDRESS);
        sc.close();
    }

}
