package strings;

public class StringsPractice {
    public static void main(String[] args) {
        String s = "Я замечательная строка";
        System.out.println(s.substring(2));
        System.out.println(s);
        //в пуле строк
        String s2 = "Я замечательная строка";
        System.out.println( s == s2);
        // создание явно строки вне пула
        String s3 = new String ("Я замечательная строка");
        System.out.println(s == s3);
        s3 = s3.intern();
        System.out.println(s == s3);

        String bad = "Bad"; // создаются множество объектов
        for (int i = 0; i < 1000; i++){
            bad = bad + i;
        }
        System.out.println(bad);

        StringBuilder goodBuilder = new StringBuilder();// изменение одной и той же строки
        for (int i = 0 ; i < 1000; i++){
            goodBuilder.append(i);
        }
        System.out.println("goodBuilder.toString() = " + goodBuilder.toString());
// Аналогично с StringBuilder
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000;i++){
            stringBuffer.append(i);
        }
        System.out.println("stringBuffer.toString() = " + stringBuffer.toString());
    }
}
















// HW:
//1.Создать SuperCat
//2.Реализовать для SuperCat методы compareTo() и clone().
//Создать объекты и отсортировать. (Часть объектов с помощью clone)
//3.Поиграться с методами класса String
//4.Аудио equals(), hashCode() и compareTo()