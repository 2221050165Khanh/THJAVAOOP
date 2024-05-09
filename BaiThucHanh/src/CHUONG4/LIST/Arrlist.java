package CHUONG4.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist  {
    public static void main(String[] args) {
        ArrayList<PERSONdemo> arrlistPerson = new ArrayList<PERSONdemo>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N:");
        int n= sc.nextInt(); 
        PERSONdemo ps = new PERSONdemo();
        for( int i= 0 ; i< n ; i++)
        {
           
            ps.NhapThongTin();
            arrlistPerson.add(ps);
        }
        for( int i= 0 ; i< n ; i++)
        {
            arrlistPerson.get(i).InThongTin();
        }
        sc.close();
    }
}
