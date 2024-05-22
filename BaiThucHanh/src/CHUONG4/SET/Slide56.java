package CHUONG4.SET;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    // xoa phan tu khoi hashset!
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet <Integer> hashset= new HashSet<>();
        int Number , n ;
        System.out.print("Nhap so phan tu danh sach "); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            System.out.print("Phan tu "+i+":"); 
            int k = sc.nextInt();
            hashset.add(k);
        }
        System.out.println("In danh sach"); 
        System.out.println(hashset); 
        // xoa 1 phan tu neu co
        System.out.print("Nhap Number : "); 
        Number= sc.nextInt();
        if(!hashset.contains(Number))
        {
            System.out.println("Danh sach khong ton tai "+Number ); 
        }
        else 
        {
            hashset.remove(Number);
            System.out.println("Xoa thanh cong");
            System.out.println("Sau khi Xoa ");
            System.out.println("-------------------------------------");
            System.out.println(hashset);
        }
sc.close();
    }
}
