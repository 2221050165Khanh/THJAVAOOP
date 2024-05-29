package CHUONG5;

import java.io.IOException;

public class Slide15 {
    void m() throws IOException{
        throw new IOException(" Loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();   
        }catch(Exception e){
            System.out.println(" Ngoai le duoc xu ly ");
        }
    }
    public static void main(String[] args) {
        Slide15 ojb = new Slide15();
        ojb.p();
        System.out.println(" Luong binh thuong ");
    }
}
