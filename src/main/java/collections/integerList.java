package collections;

import java.util.ArrayList;

public class integerList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(14);
        arrayList.add(1131);
        arrayList.add(16);
        arrayList.add(12312);
        arrayList.add(18);
        arrayList.add(1230);
        for (int i = 0 ; i < arrayList.size() ;i++){
            if (i % 3 == 0){
                arrayList.remove(i%3);
            }
        }
        for (int i = 0 ; i < arrayList.size() ;i++){

        }


    }
}
