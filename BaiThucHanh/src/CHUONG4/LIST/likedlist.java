package CHUONG4.LIST;

import java.util.LinkedList;
import java.util.Scanner;
public class likedlist {
    public static void main(String[] args) {
        LinkedList <Integer> Liked  = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
       Liked.add(4);
       System.out.print("Nhap N:");
       int n;
       int number;
       do
        n=sc.nextInt();
       while (n<0);
       for (int i= 0; i< n ; i++)
       {
        System.out.print("Nhap Number " +(i+1)+":");
        number=sc.nextInt();
        Liked.add(number);
       }

       System.out.print("In danh sach :");
       for (int i= 0; i< n ; i++)
       {
        System.out.print(Liked.get(i));
       }
       sc.close();
    }
}
