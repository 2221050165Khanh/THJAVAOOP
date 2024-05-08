package Person;

import java.util.Scanner;

public class person {
    public String Fullname;
    public int Old;
    public int Kg;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin :");
        Fullname = sc.nextLine();
        Old = sc.nextInt();
        Kg = sc.nextInt();
        sc.close();
    }

    public void InThongTin() {
        System.out.print("\nTen :" + Fullname);
        System.out.print("\nTuoi :" + Old);
        System.out.print("\nCan Nang :" + Kg);
    }

    public person() {
        Fullname = "Nguyen xuan Khanh";
        Old = 20;
        Kg = 57;
    }

    public void InThongTin(String Ten) {
        System.out.print("\nTen :" + Ten);
        System.out.print("\nTuoi :" + Old);
        System.out.print("\nCan Nang :" + Kg);
    }

}
