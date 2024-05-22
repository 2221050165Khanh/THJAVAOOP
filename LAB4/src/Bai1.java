import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> Input = new ArrayList<>();
        System.out.print("Nhap n so nguyen :");
        Scanner sc = new Scanner(System.in);
        int n,m;
        int number,max=0;
        do 
         n=sc.nextInt();
        while( n<0);
        for ( int i=1 ; i<=n ; i++)
        {
            System.out.print(" so nguyen"+i+":");

            number=sc.nextInt();
            if(number>max){
                max=number;
            }
            Input.add(number);
        }
        System.out.println("Gia tri max ="+max);
        System.out.println("Nhap m :");
        m=sc.nextInt();
        Input.remove(m);
        Input.sort((a,b)-> a.compareTo(b));
        for (int i=0 ; i<= n ; i++)
        {
        System.out.print(Input.get(i)+" ");
        }
        
    }
}
