package ArrayListPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class MyArryList<T>  {
    private Object[] array;
    private int size;
    public MyArryList() {
        array = new Object[10];
        size = 0;
    }
    public MyArryList(int length) {
        size = 0;
        array = new Object[length];

    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)){
                return true;
            }
        }
        return false;
    }
    public Object[] toArray() {
        return Arrays.copyOf(array,size);
    }
    public boolean add(Object o) {
        if (array.length == size){
            Object[] tempArray = new Object[(3*array.length/2) + 1];
            for (int i = 0; i < array.length ; i++){
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder resStrBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            resStrBuilder.append('[').append(array[i].toString()).append("] ");
        }
        resStrBuilder.append('}');
       return resStrBuilder.toString();
    }

    public boolean remove(Object o) {
        for (int i = 0; i < size(); i++) {
            if (i == size) {
                if (i != this.size() - 1)
                    System.arraycopy(array, i + 1, array, i, this.size() - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean addAll(Collection collection) {
        Collection collection1 = new ArrayList();
        collection1.add("Жмурка");
        collection1.add("Вытегра");

        return false;
    }

    public void clear() {

    }

    public Object get(int i) {
        return null;
    }

    public Object set(int i, Object o) {
        return null;
    }

    public void add(int i, Object o) {

    }

    public Object remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public boolean containsAll(Collection collection) {
        return false;
    }
}
