package interfaces;

import org.w3c.dom.ls.LSOutput;

public interface Swimable {
    boolean swim();
    void printSwim();
    default void print(){
        System.out.println("Swimable");
    }

}
