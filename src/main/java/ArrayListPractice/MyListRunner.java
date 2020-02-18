package ArrayListPractice;

import interfaces.SuperCow;

public class MyListRunner {
    public static void main(String[] args) {
        MyArryList list = new MyArryList();
        System.out.println("list.size() = " + list.size());
        list.add(new SuperCow(50, "Будёновка"));
        list.add(new SuperCow(50, "Сэменуэль"));
        list.add(new SuperCow(40, "Michale Jackson"));
        System.out.println(list.toString());
        System.out.println("list.size() = " + list.size());

        System.out.println(list.toString());
}
}
