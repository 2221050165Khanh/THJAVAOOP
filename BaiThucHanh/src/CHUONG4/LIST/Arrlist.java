package CHUONG4.LIST;

import java.util.ArrayList;
import java.util.Scanner;


public class arrlist  {
    public static void main(String[] args) {
        ArrayList<Integer> Input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N:");
        int n= sc.nextInt(); 
        int Number;
        for( int i= 0 ; i< n ; i++)
        { 
          System.out.print(" Nhap Number "+(i+1)+":");
           Number= sc.nextInt();
           Input.add(Number);
        }
        Input.set(1, 5);
        Input.add(2, 9);
        Input.remove(2);
        for( int i= 0 ; i< n ; i++)
        {
         System.out.println(Input.get(i));
        }
        sc.close();
    }
}
