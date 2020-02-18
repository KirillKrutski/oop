package interfaces;

import java.util.Arrays;

public class SuperCow implements Cloneable, Comparable<SuperCow> {
    private double power = 100.0;
    private String name;

    public SuperCow(){

    }

    public SuperCow(double power, String name){
        this.power = power;
        this.name = name;
    }


    public void print(){
        System.out.println("Supercow!");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
      //  return super.clone();
        return new SuperCow(power,name);
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperCow{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';



    }

    @Override
    public int compareTo(SuperCow o) {
        return (int) (power - o.power);
    }

 /*   @Override
    public int compareTo(Object o){
        if (o instanceof SuperCow) {


            return (int) (this.power - ((SuperCow) o).power);
        }
     //   return 0;
    }
    */

}
