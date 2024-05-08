package CHUONG4.Collection;

import java.util.ArrayList;
import java.util.Scanner;

import CHUONG4.PERSON;

public class list {
    public static void main(String[] args) {
        ArrayList<PERSON> arrlistPERSON = new ArrayList<PERSON>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = sc.nextInt();
        PERSON PS = new PERSON();
        for ( int i=0 ; i<n ; i++ )
        {
        PS.NhapThongTin();
        arrlistPERSON.add(PS);
        }
        for ( int i=0 ; i<n ; i++ )
        {
            arrlistPERSON.get(i).InThongTin();
        }
        
    }
}
