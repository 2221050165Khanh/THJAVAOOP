import java.util.Scanner;
import java.time.Year;

public class Slide93Chuong2 {
    public static void main(String[] args) {
        String Name;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten:");
        Name = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        year = sc.nextInt();
        int yearnow = Year.now().getValue();
        int old = yearnow - year;
        sc.close();
        if (old < 16)
            System.out.print("Ban " + Name + " Tuoi Vi Thanh Nien");
        else if (old > 18)
            System.out.print("Ban " + Name + " Da gia");
        else
            System.out.print("Ban " + Name + " Tuoi Truong Thanh");
    }
}