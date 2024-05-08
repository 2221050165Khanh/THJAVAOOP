package ThucHanhABSinter;

public class Honda4 extends Bike{
   public void run(){
        System.out.println(" Running Safely");
    }
    public void color(){
        System.out.println("Xanh , Do ,Tim, Vang");
    }
    public void Lop(){
        System.out.println("To , nho");
    }
    public static void main(String[] args) {
        Bike BKL= new Honda4();
        BKL.run();
        BKL.color();
        Bike Niza= new Honda4();
        Niza.Lop();
    }
}
