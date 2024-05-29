package CHUONG5;

public class Slilde08 {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]= 30/0;
        }catch(ArithmeticException e){
            System.out.println(" take 1 Hoan thanh");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" take 2 Hoan thanh");
        }catch(Exception e){
            System.out.println(" common take Hoan thanh");
        }
        System.out.println(" res of code");

    }
    
}
