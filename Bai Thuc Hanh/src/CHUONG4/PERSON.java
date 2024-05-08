package CHUONG4;

import java.util.Scanner;

public class PERSON{
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
        System.out.print("Ten :" + Fullname);
        System.out.print("ID :"+ID);
    }
 }
