import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Slide96Bai10Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        String kytu;
        System.out.println("Nhap 1 ky tu :");
        kytu = sc.nextLine();
        Pattern p = Pattern.compile(kytu);
        int count = 0;

        do {
            System.out.print("Nhap chuoi bat ki: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        Matcher m = p.matcher(chuoi);
        while (m.find()) {
            count++;
        }
        sc.close();
        System.out.print("So lan xuat hien ky tu " + kytu + "=" + count);
    }
}
