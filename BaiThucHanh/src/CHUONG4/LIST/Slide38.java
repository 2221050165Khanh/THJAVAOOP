package CHUONG4.LIST;

import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // Add
        list.add("Luong Duc");
        list.add("Xuan Khanh");
        // Them phan tu list vao listA
        LinkedList<String> ListA = new LinkedList<>();
        ListA.addAll(list);
        System.out.println(" IN listA");
        showlist(ListA);
        System.out.println("Phuong thuc retainALL");
        System.out.println("---------------------------------");
        LinkedList<String> ListB = new LinkedList<>();
        ListB.add("Xuan Khanh");
        ListA.retainAll(ListB);
        System.out.println(" IN listA");
        showlist(ListA);
        System.out.println("Phuong thuc removeALL");
        System.out.println("---------------------------------");
        list.removeAll(ListB);
        System.out.println(" IN list");
        showlist(list);
    }
    public static void showlist(LinkedList<String> list)
    {
        for (String a : list){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
