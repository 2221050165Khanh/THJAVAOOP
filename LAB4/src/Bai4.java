import java.util.HashSet;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        String traicay, tim_traicay;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Trai cay: ");
            traicay =sc.nextLine();
            if( traicay == "")
                break;
            set1.add(traicay);
        }
        System.out.println(set1);
        System.out.println("Nhap loai trai cay can tim kiem");
        tim_traicay = sc.nextLine();
        if(set1.contains(tim_traicay))
            System.out.println("Tim thay");
        else
            System.out.println("Khong tim thay");
        
        System.out.println("Nhap loai trai cay can xoa");
        String xoa = sc.nextLine();
        if(set1.remove(xoa))
            System.out.println("Da xoa");
        else
            System.out.println("Khong co trai cay nay");
        System.out.println("Phan tu con lai");
        System.out.println(set1);
    }
}

