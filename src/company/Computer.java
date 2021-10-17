package company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private boolean processor;
    private boolean ram;
    private boolean hdd;
    private int fullCycleResource;


    public Computer(boolean processor, boolean ram, boolean hdd, int fullCycleResource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.fullCycleResource = fullCycleResource;
    }

    public boolean isProcessor() {
        return processor;
    }

    public void setProcessor(boolean processor) {
        this.processor = processor;
    }

    public boolean isRam() {
        return ram;
    }

    public void setRam(boolean ram) {
        this.ram = ram;
    }

    public boolean isHdd() {
        return hdd;
    }

    public void setHdd(boolean hdd) {
        this.hdd = hdd;
    }

    public int getFullCycleResourceOn() {
        return fullCycleResource;
    }

    public void setFullCycleResourceOn(int fullCycleResourceOn) {
        this.fullCycleResource = fullCycleResourceOn;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", fullCycleResource=" + fullCycleResource +
                '}';
    }

    public void turnOn() {
        if (isReadyForWorking() == true) {
            if (fullCycleResource != 0) {
                Random random = new Random();
                int guessedNumber = random.nextInt(2);
                int userNumber;

                System.out.println("Enter 1 or 0 to turn on the computer");
                Scanner sc = new Scanner(System.in);
                userNumber = sc.nextInt();
                while (true) {
                    while (userNumber != 0 && userNumber != 1) {
                        fullCycleResource--;
                        System.out.println("You have " + fullCycleResource + " resources");
                        if (checkFullCycleResource() == false) break;
                        System.out.println("Please enter only 0 or 1");
                        userNumber = sc.nextInt();
                    }
                    if (checkFullCycleResource() == false) break;
                    if (userNumber == guessedNumber) {
                        System.out.println("Congratulations! You guess the number. Your computer is on\n");
                        break;
                    }
                    if (userNumber != guessedNumber) {
                        fullCycleResource--;
                        System.out.println("You have " + fullCycleResource + " resources");
                        if (checkFullCycleResource() == false) break;
                        System.out.println("Ohhh,u didn't guess the number. Next time u'll do it! Try again. Enter number");
                        userNumber = sc.nextInt();
                    }
                }
            } else {
                System.out.println("You can't turn it on because your computer burned out");
            }
        }
    }

    public boolean checkFullCycleResource() {
        if (fullCycleResource == 0) {
            System.out.println("Limit of resources. Your computer burned out!\n");
            return false;
        } else return true;
    }

    public boolean isReadyForWorking() {
        if (processor == true && ram == true && hdd == true && fullCycleResource > 0) {
            System.out.println("Your computer is ready for working. You can turn it on!\n");
            return true;
        } else System.out.println("Your computer isn't ready for working. You can't turn it on!\n");
        return false;
    }

    public boolean turnOff() {
        if (fullCycleResource != 0) {
            Random random = new Random();
            int guessedNumber = random.nextInt(2);
            int userNumber;

            System.out.println("Enter 1 or 0 to turn off the computer");
            Scanner sc = new Scanner(System.in);
            userNumber = sc.nextInt();
            while (true) {
                while (userNumber != 0 && userNumber != 1) {
                    fullCycleResource--;
                    System.out.println("You have " + fullCycleResource + " resources");
                    if (checkFullCycleResource() == false) break;
                    System.out.println("Please enter only 0 or 1");
                    userNumber = sc.nextInt();
                }
                if (checkFullCycleResource() == false) break;
                if (userNumber == guessedNumber) {
                    System.out.println("Congratulations! You guess the number. Your computer is off\n");
                    break;
                }
                if (userNumber != guessedNumber) {
                    fullCycleResource--;
                    System.out.println("You have " + fullCycleResource + " resources\n");
                    if (checkFullCycleResource() == false) break;
                    System.out.println("Ohhh,u didn't guess the number. Next time u'll do it! Try again. Enter number");
                    userNumber = sc.nextInt();
                }
            }
            return true;
        } else {
            System.out.println("You can't turn it off because your computer burned out\n");
            return false;
        }
    }

    public void computerDescription() {
        System.out.println("Description of the computer" +
                "\nprocessor : " + ((processor) ? " + " : " - ") +
                "\nram : " + ((ram) ? " + " : " - ") +
                "\nhdd : " + ((hdd) ? " + " : "  - ") +
                "\nfullCycleResource : " + fullCycleResource + " resources\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return processor == computer.processor &&
                ram == computer.ram &&
                hdd == computer.hdd &&
                fullCycleResource == computer.fullCycleResource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, hdd, fullCycleResource);
    }
}


