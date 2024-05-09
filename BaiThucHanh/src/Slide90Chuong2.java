
import java.util.Scanner;

public class Slide90Chuong2 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi :");
        chuoi = sc.nextLine();
        sc.close();
        System.out.print("Cac ky tu trong chuoi:");
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }

    }
}
