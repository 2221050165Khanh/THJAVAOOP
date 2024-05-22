package CHUONG4.LIST;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Khai bao 1 danh sach 
        // Luu tru thang nam 
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Thang 1");
        linked.add("Thang 2");
        linked.add("Thang 3");
        linked.add("Thang 4");
        linked.add("Thang 5");
        linked.add("Thang 6");
        linked.add("Thang 7");
        linked.add("Thang 8");
        linked.add("Thang 9");
        linked.add("Thang 10");
        linked.add("Thang 11");
        linked.add("Thang 12");
        System.out.print("Nhap vao chi so phan tu can lay :");
        int index= sc.nextInt();
        if((index <0)|| (index> (linked.size()-1)))
        {
            System.out.println(" Chi so can lay > 0 hoac <"+(linked.size()-1));
        }
        else 
        {
            String note = linked.get(index);
            System.out.println(" Phan tu chi so ("+index+") trong danh sach la :"+note);
        }
        // Phan tu dau tien trong ds
        String firstlist= linked.getFirst();
        // Phan tu cuoi trong ds
        String lastList = linked.getLast();
        System.out.println("Phan tu dau tien trong ds :"+ firstlist);
        System.out.println("Phan tu cuoi cung trong ds :"+ lastList);
        sc.close();
    }
}
