package collections;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        boolean flag = false;
        List<String> StarList = new ArrayList<>();
        StarList.add("Александр");
        System.out.println("StarList.get(0) = " + StarList.get(0));
        System.out.println("StarList.contains(\"Александр\") = " + StarList.contains("Александр"));
//        StarList.remove(0);
//        System.out.println("StarList.get(0) = " + StarList.get(0));
        StarList.clear();
//        System.out.println("StarList.get(0) = " + StarList.get(0));
        StarList.add("Александр");
        StarList.add("Дмитрий");
        StarList.add("Николай");
        StarList.add("Иван");
        StarList.add("ИвАн");
        System.out.println();
        System.out.println("Вывод списка ");
        for (String s : StarList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Вывод списка (fori)");
        for (int i = 0; i < StarList.size(); i++) {
            System.out.println(StarList.get(i));
        }
        System.out.println();
        System.out.println("Вывод списка в обратном порядке(fori)");
        for (int i = StarList.size() - 1; i >= 0; i--) {
            System.out.println(StarList.get(i));
        }
        System.out.println();
        System.out.println("Вывод индексов Иванов:");
        for (int i = 0; i < StarList.size(); i++) {
            if (StarList.get(i).equalsIgnoreCase("Иван")){
               //StarList.indexOf(i);
               System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Новый лист");
        List<String> StarList2 = new ArrayList<>();
        StarList2.add("Андрей");
        StarList2.add("Дима");
        StarList2.add("Леша");
        StarList2.add("Тёма");
        StarList2.add("Семен");
        StarList2.add("Кирилл");
        StarList2.add("Глеб");


            for (int i = 0; i < StarList2.size(); i++) {
                if (StarList2.get(i).equalsIgnoreCase("Иван")) {
                    System.out.println(i);
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Иванов - нет.Хотите добавить Ивана?");
            }
        }}
//.equalsIgnoreCase()