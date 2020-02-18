package interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Talkable cow = new Cow(

        );
        cow.talk();

        Swimable cat = new Cat();
        cat.printSwim();

        Flyable cow24 = new FlyingCows();
        cow24.fly();

        Talkable murzik = new Cat();
        murzik.print();

        Cow cowMurka = new Cow();
        cowMurka.print();
//HW
        Learnable person = new Person();
        person.learn();
//
        SuperCow superMurka = new SuperCow();
        superMurka.setName("Matrena");
        SuperCow twinMurka = (SuperCow) superMurka.clone();

        twinMurka.setPower(200.0);
        System.out.println("superMurka = " + superMurka.toString());
        System.out.println("twinMurka = " + twinMurka.toString());

        int[] numsArray = new int[]{1,-2,3,0,32,4};
        Arrays.sort(numsArray);
        System.out.println("Arrays.toString() = " + Arrays.toString(numsArray));

        SuperCow cow1 = new SuperCow();
        SuperCow cow2 = new SuperCow();
        SuperCow cow3 = new SuperCow();
        cow1.setPower(50.0);
        cow2.setPower(150.0);
        SuperCow[] superCowsArray = new SuperCow[]{cow1,cow2,cow3};
        Arrays.sort(superCowsArray);
        System.out.println("Arrays.toString(superCowsArray) = " + Arrays.toString(superCowsArray));

       // System.out.println(cow2.compareTo("Bad string"));
    }
}
