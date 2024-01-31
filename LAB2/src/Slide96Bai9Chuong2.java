import java.util.Scanner;

public class Slide96Bai9Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        int demSo = 0, demInThuong = 0, demInHoa = 0;
        System.out.print("Nhap chuoi bat ky: ");
        chuoi = sc.nextLine();
        sc.close();
        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(i);
            int asciiValue = (int) kytu;
            if (asciiValue >= 97 && asciiValue <= 122)
                demInThuong++;
            else if (asciiValue >= 65 && asciiValue <= 90)
                demInHoa++;
            else if (asciiValue >= 49 && asciiValue <= 57)
                demSo++;
        }
        System.out.println("So gia tri chu cai Hoa la : " + demInHoa);
        System.out.println("So gia tri chu cai Thuong la : " + demInThuong);
        System.out.println("So gia tri chu so la : " + demSo);
    }
}
