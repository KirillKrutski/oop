package HW;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> list02 = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list02.add(i);
        }
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите шестой элемент");
        list02.set(2, scanner.nextInt());
        System.out.println("Введите седьмой элемент");
        list02.set(0, scanner.nextInt());
        System.out.println("Список");
        ArrayList<Integer> list03 = new ArrayList<>(list02);
        for(Integer a: list03) System.out.print(a + " ");
        list03.remove((Integer)89);
        list03.remove(3);
        System.out.println(" ");
        for(Integer a: list03) System.out.print(a + " ");
    }
}
