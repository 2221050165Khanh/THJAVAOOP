package CHUONG5;

public class Silde11 {
    public static void main(String[] args) {
        try{
            int data=25/5;
            System.out.println(data);
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally tiep tuc ");
        }
        System.out.println(" rest of the code.. ");
    }
}
