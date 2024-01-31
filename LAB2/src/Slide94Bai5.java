import java.util.Scanner;

public class Slide94Bai5 {
    public static void main(String[] args) {
        int number, sum = 0;
        String StrResuat = "";
        Scanner sc = new Scanner(System.in);
        while (sum <= 100) {
            System.out.print("Nhap vao so nguyen bat ky: ");
            number = sc.nextInt();
            sum = sum + number;
            StrResuat = StrResuat + number + " + ";
        }
        sc.close();
        System.out.println(StrResuat.substring(0,
                StrResuat.length() - 2) + " = " + sum);
    }
}
