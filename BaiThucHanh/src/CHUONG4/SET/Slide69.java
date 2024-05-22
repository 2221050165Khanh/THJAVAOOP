package CHUONG4.SET;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    // Them phan tu cho tree set
    public static void main(String[] args) {
        TreeSet<Integer> Cayset = new TreeSet<>();
        Scanner sc= new Scanner(System.in);
        int Number , n ;
        System.out.print("Nhap so phan tu danh sach "); 
        do
        n=sc.nextInt();
        while(n<0);
        for (int i =1 ; i <= n ; i++){
            System.out.print("Phan tu "+i+":"); 
            int k = sc.nextInt();
            Cayset.add(k);
        }
        System.out.println("In danh sach"); 
        System.out.println(Cayset );
         System.out.print("Nhap phan tu can them :");
         Number = sc.nextInt();
    //  Kiem tra ton tai 
    if(!Cayset.contains(Number)){
        Cayset.add(Number);
        System.out.println("them thanh cong");
        System.out.println("Sau khi them ");
        System.out.println("-------------------------------------");
        System.out.println(Cayset);
    }
    else
    {
        System.out.println("Phan tu "+Number+" da ton tai !");
    }
    System.out.print("Nhap Number : "); 
    Number= sc.nextInt();
    if(!Cayset.contains(Number))
    {
        System.out.println("Danh sach khong ton tai "+Number ); 
    }
    else 
    {
        Cayset.remove(Number);
        System.out.println("Xoa thanh cong");
        System.out.println("Sau khi Xoa ");
        System.out.println("-------------------------------------");
        System.out.println(Cayset);
    }
sc.close();
  }
}
