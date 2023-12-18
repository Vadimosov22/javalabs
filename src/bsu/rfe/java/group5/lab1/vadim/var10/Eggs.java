package bsu.rfe.java.group5.lab1.vadim.var10;

public class Eggs extends Food{
    public String getNumber() {
        return number;
    }

    public void setNumber(String taste) {
        this.number = number;
    }

    private String number;
    public Eggs(String number) {
        super("Яйцо");
        this.number = number;
    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Eggs)) return false; // Шаг 2
            return number.equals(((Eggs)arg0).number); // Шаг 3
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " сьедено");
    }
    @Override
    public String toString(){
        return "Яйцо в количестве " + number;
    }
}
