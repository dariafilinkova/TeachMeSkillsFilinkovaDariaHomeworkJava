package company;

public class Main {

    public static void main(String[] args) {
        Computer comp1 = new Computer(true, true, true, 5);
        System.out.println(comp1.toString());
        comp1.computerDescription();
        comp1.turnOn();
        comp1.turnOff();

        Computer comp2 = new Computer(false, true, true, 4);
        comp2.computerDescription();
        comp2.turnOn();

        Computer comp3 = new Computer(false, true, true, 4);
        comp3.computerDescription();
        System.out.println(comp2.equals(comp3));
    }
}
