package exception;

import java.util.Scanner;

public class ExceptionRunner {
    public static void main(String[] args) {
        // throw new "Любая ошибка"
//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите число");
//        int variable = console.nextInt() ;
//        variable = variable / 0 ;
//       System.out.println(variable);
        Man alexsandr = new Man("Alexsandr", 10);
        try {
            alexsandr.setAge(5);
        } catch (MyBeautifulException ex){
            System.err.print("Bad Age");
           // ex.getMessage();
            ex.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
