package interfaces;

public class Cat implements Talkable, Swimable {
    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public boolean swim() {
        return false;
    }

    @Override
    public void printSwim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void print(){
        System.out.println("Cat");
    }

}
