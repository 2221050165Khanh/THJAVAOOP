import java.util.ArrayList;
import java.util.Scanner;

public class NXK165Person {
    public String Name ;
    public int Tuoi ;
    public float ID ;

    public void NhapTT(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten Person :");
        Name= sc.nextLine();
        System.out.print("Nhap Tuoi :");
        Tuoi= sc.nextInt();
        System.out.print("Nhap ID :");
        ID= sc.nextFloat();
    }
    public void XuatTT(){
        System.out.println("Ten Person :"+Name);
       
        System.out.println(" Tuoi :"+Tuoi);
        
        System.out.println(" ID :"+ID);
    
    }
    public String setName(String Name){
        return this.Name=Name;
    }
    public int setTuoi(int Tuoi){
        return this.Tuoi=Tuoi;
    }
    public float setID(float ID){
        return this.ID=ID;
    }
    ArrayList<NXK165Person> NXKlist = new ArrayList<>();
    public static void main(String[] args) {
        NXK165Person PS1= new NXK165Person();
        Scanner sc = new Scanner(System.in);
        
        PS1.ThemTT();
        PS1.HienThiTT();
        PS1.XoaTT();
        PS1.HienThiTT();
        PS1.Suathongtin();
        PS1.HienThiTT();
        
    }
     // 3. Sua thong tin 
     public  void Suathongtin(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Nhap vi tri can sua:");
         int  x = sc.nextInt();
       if(x>=0 && x< NXKlist.size()){
       NXK165Person sv= NXKlist.get(x);
       if(sv!=null){ 
        
        System.out.print("Nhap new name: ");
        String name = sc.nextLine();
        sc.nextLine();
        sv.setName(name);
        System.out.print("Nhap new age: ");
        int age = Integer.parseInt(sc.nextLine());
        
        sv.setTuoi(age);
        System.out.print("Nhap new ID: ");
        Float newID = sc.nextFloat();
        sv.setID(newID);
        System.out.println(" Thanh cong");
       }
    }
       else System.out.println("Khong hop le");
    }
    public void ThemTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap danh sach co so phan tu n = :");
        int n = sc.nextInt();
        
        //1. them 
        for(int i= 0 ; i<n ; i++){
            NXK165Person Person = new NXK165Person();
            System.out.println("Nhap Thong tin Person thu "+(i+1)+": ");
            Person.NhapTT();
            NXKlist.add(Person);
        }
    }
    public  void HienThiTT(){
        if(NXKlist.isEmpty()){
            System.out.println(" Danh sach rong");
        }
        else 
        {
            for(int i= 0 ; i< NXKlist.size(); i++){
                System.out.println("Sinh Vien Thu "+(i+1)+":");
                NXKlist.get(i).XuatTT();
            }
        }
    }
    public void XoaTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vi tri can xoa:");
        int x= sc.nextInt();
       if(x>=0 && x<NXKlist.size()){
           NXKlist.remove(x);
   }
    }
}
