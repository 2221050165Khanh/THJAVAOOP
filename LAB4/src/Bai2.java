import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
         LinkedList<Integer> SONguyen = new LinkedList<>();
         Scanner sc = new Scanner(System.in);
          int n;
            do{
                System.out.print("Nhap N so nguyen = ");
                n = sc.nextInt();
            }
            while(n<0);
            for( int i = 0 ; i< n ; i++){
                System.out.print("Nhap so nguyen thu "+(i+1)+": ");
                int number= sc.nextInt();
                SONguyen.add(number);
            }
            System.out.println("In danh sach ");
            
            System.out.println(SONguyen);
            System.out.println("I------------");
            int Sum=0;
            int Dem=0;
            float TBC;
        for( int i = 0 ; i< n ; i++){
                if(SONguyen.get(i)%2==0){
                    Sum=Sum+SONguyen.get(i);
                    Dem++;
                }
                
        }
         TBC = Sum/Dem;
        System.out.println(" Gia tri TB ="+TBC);
    }
}

