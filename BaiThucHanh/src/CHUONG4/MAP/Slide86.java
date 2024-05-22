package CHUONG4.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Slide86 {
    // Hien thi toan bọ entry
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , Integer> hashMap= new HashMap<>();
        int n ;
        System.out.print("Nhap so phan tu danh sach :"); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            System.out.print("Phan tu "+i+":"); 
            int k = sc.nextInt();
            hashMap.put(i,k);
        }
        // Tao 1 set chua toan bo entry
        Set<Map.Entry<Integer,Integer>> sethashmap = hashMap.entrySet();
        System.out.println("Cac phan tu co trong entry :"); 
        System.out.print(sethashmap); 
        sc.close();
    }
}
