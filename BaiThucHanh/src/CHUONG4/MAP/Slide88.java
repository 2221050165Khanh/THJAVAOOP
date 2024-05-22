
package CHUONG4.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Slide88 {
    // Lay du lieu value trong hashmap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hashMap1= new HashMap<>();
        int n ;
        System.out.print("Nhap so phan tu danh sach :"); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            System.out.print("Phan tu "+i+":"); 
          int k = sc.nextInt();
            hashMap1.put(i,k);
        }
        // Tao 1 set chua toan bo entry
      Set<Map.Entry<Integer,Integer>> Mapcity =hashMap1.entrySet();
        System.out.println("Cac phan tu co trong entry :"); 
        System.out.print(Mapcity); 
        sc.close();
        System.out.println("------------------ :"); 
        System.out.println("Phan tu 2:"+ hashMap1.get(2)); 
        System.out.println("------------------ :"); 
        if(hashMap1.containsValue(4)){
            System.out.println("gia tri 4 co trong hashMap"); 
        }
    }
}