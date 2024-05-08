import java.util.Scanner;

public class Slide40Chuong2 {
    public static void main(String agre[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so ngay ");
        int ngay = scan.nextInt();
        scan.close();
        switch (ngay) {
            case 0:
                System.out.println("Thu 7");
                break;
            case 1:
                System.out.println("Chu nhat");
                break;
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            default:
                System.out.println("So ngay khong hop le");
        }
    }
}
