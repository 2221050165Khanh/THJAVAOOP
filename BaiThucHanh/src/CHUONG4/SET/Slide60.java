package CHUONG4.SET;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Slide60 {
    // xoa 1 phan tu bat ky khoi linkedhashset 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        int Number , n ;
        System.out.print("Nhap so phan tu danh sach "); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            System.out.print("Phan tu "+i+":"); 
            int k = sc.nextInt();
            linkedhashset.add(k);
        }
        System.out.println("In danh sach"); 
        System.out.println(linkedhashset );
           // xoa 1 phan tu neu co
           System.out.print("Nhap Number : "); 
           Number= sc.nextInt();
           if(linkedhashset.contains(Number))
           {
               System.out.println("Danh sach khong ton tai "+Number ); 
           }
           else 
           {
            linkedhashset.remove(Number);
               System.out.println("Xoa thanh cong");
               System.out.println("Sau khi Xoa ");
               System.out.println("-------------------------------------");
               System.out.println(linkedhashset);
           }
   sc.close();
    }
}
