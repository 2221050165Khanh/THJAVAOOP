package CHUONG5;

public class Slide13 {
    static void validate(int age){
        try{
            if(age<18)
            throw new ArithmeticException("not valide");
            else  System.out.println(" ko co gi ");

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
    }
    public static void main(String[] args) {
        validate(19);
        System.out.println(" rest of the code ");
    }
}
