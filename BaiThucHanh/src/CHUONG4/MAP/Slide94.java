package CHUONG4.MAP;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Slide94 {
    // Xoa phan tu khoi linkedHashMap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer , Integer> Linkedmap = new LinkedHashMap<>();
        int n; 
        System.out.print("Nhap so phan tu danh sach :"); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            // System.out.print("Phan tu:"); 
            // int x= sc.nextInt();
            System.out.print("Phap gia tri"+i+":"); 
            Integer k = sc.nextInt();
            Linkedmap.put(i,k);
        }
        Set<Map.Entry<Integer, Integer>> Value = Linkedmap.entrySet();
        System.out.println("Danh Sach phan tu :"); 
        System.out.println(Value);
        System.out.println("--------------"); 
        System.out.println("Danh Sach phan tu sau khi xoa :"); 
        Linkedmap.remove(2);
        System.out.println(Value);

        sc.close();
    }
}
