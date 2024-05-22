package CHUONG4.SET;

import java.util.HashSet;
import java.util.Scanner;


public class Slide54 {
    public static void main(String[] args) {
        // Them 1 phan tu vao danh sach 
        Scanner sc= new Scanner(System.in);
        // 1. tao danh sach 
        HashSet<Integer> List = new HashSet<>();
       List.add(1);
       List.add(2);
       List.add(3);
       List.add(4);
       List.add(5);
    //    hien thi 
    System.out.println("Cac phan tu trong hashSet :");
    System.out.println(List);
    // Nhap phan tu can them 
    System.out.print("Nhap phan tu can them :");
    int Number = sc.nextInt();
    //  Kiem tra ton tai 
    if(!List.contains(Number)){
        List.add(Number);
        System.out.println("them thanh cong");
        System.out.println("Sau khi them ");
        System.out.println("-------------------------------------");
        System.out.println(List);
    }
    else
    {
        System.out.println("Phan tu "+Number+" da ton tai !");
    }
    sc.close();
  }
}
