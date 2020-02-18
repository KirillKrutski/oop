package exception;

public class Man {
    private String name;//поля
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) throws MyBeautifulException {
        if (age < 0){
            throw new MyBeautifulException();
        }
        this.age = age;
    }
}
