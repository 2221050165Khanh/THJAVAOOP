import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        int i,j,j1,n;
        Scanner sc = new Scanner(System.in);
        Map<Integer, SinhVieen> map1 = new HashMap<>();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for(i = 0; i< n; i++)
        {
            SinhVieen sv = new SinhVieen();
            sv.nhapHoTen();
            sv.nhapLop();
            sv.nhapMSV();
            map1.put(i, sv);
        }

        sc.nextLine();
        System.out.println("Nhap lop can tim: ");
        String Lop = sc.nextLine();
        System.out.println("Nhung ban trong lop do");
        for(j = 0; j< map1.size(); j++)
        {
            if(map1.get(j).lop.equals(Lop))
                {System.out.println("Ho va ten: "+ map1.get(j).hoten);
                System.out.println("----------------------");}
            else
                System.out.println("Khong tim thay lop do");
        }
        
        System.out.println("Nhap ma sinh vien can tim: ");
        int maSv = Integer.parseInt(sc.nextLine());
        System.out.println("Ho ten va lop cua nguoi co ma sinh vien do: ");
        for(j1 = 0; j1< map1.size(); j1++)
        {
            if(map1.get(j1).msv == maSv)
                {System.out.println("Ho va ten: "+ map1.get(j1).hoten);
                System.out.println("Lop: "+ map1.get(j1).lop);}
            else
                System.out.println("Khong tim thay ma sinh vien do");
        }
    }
}