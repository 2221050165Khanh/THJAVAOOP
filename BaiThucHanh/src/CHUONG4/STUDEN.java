package CHUONG4;

import java.util.Scanner;

public class Studen {
    public String FullName;
    public int Age;
    Scanner sc = new Scanner(System.in);
    public void NhapTT()
    {
        System.out.print("Nhap Ten :");
        FullName = sc.nextLine();
        System.out.print("Nhap Tuoi :");
        Age = sc.nextInt();
    }
    public void InTT(){
        System.out.print(" Ten :"+ FullName);
        System.out.print(" Tuoi :" +Age);
    }
}
