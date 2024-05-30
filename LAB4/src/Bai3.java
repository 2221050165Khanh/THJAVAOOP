import java.util.ArrayList;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int i=0, dem = 0, n;
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhvien> sinhviens = new ArrayList<>();
        System.out.println("Nhap n");
        n =sc.nextInt();
        for(int a = 0; a < n; a++)
        {
            sinhvien sv1 = new sinhvien();
            sv1.nhapTen();
            sv1.nhapDiem();
            sinhviens.add(sv1);
        }
        while (true) {
            sinhvien sv = new sinhvien();
            sv.nhapTen();
            if(sv.ten == "")
                break;
            sv.nhapDiem();
            sinhviens.add(i, sv);
            i=i+1;
        }
        for( int c = 0;c < sinhviens.size(); c++)
        {   if(sinhviens.get(c).diem <= 5)
                dem = dem +1;
        }
        System.out.println("So sinh vien thi lai la " + dem);
        System.out.println("Nhung sinh vien thi lai");
        for( int b = 0;b < sinhviens.size(); b++)
        {   if(sinhviens.get(b).diem <= 5)
                sinhviens.get(b).InThongTin();
        }
        int max = 0;
        for(int d=1; d<sinhviens.size(); d++)
        {   if(sinhviens.get(max).diem < sinhviens.get(d).diem )
                max = d;
            if(sinhviens.get(max).diem == sinhviens.get(d).diem )
                sinhviens.get(d).InThongTin();
        }
        sinhviens.get(max).InThongTin();        
        sc.nextLine();
        System.out.print("nhap gia tri can tim: ");
        String name  = sc.nextLine();
        for(int f = 0; f < sinhviens.size(); f++ )
        {   if(sinhviens.get(f).ten.equals(name))
                sinhviens.get(f).InThongTin();
        }
    }
}
