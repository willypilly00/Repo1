import java.util.Scanner;
public class Driver {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter in a string for me to count: ");
        String alpha = input.nextLine();
        System.out.println("The String \"" + alpha +"\" has " + alpha.length() + " characters");

        System.out.println("\n\n");

        ComplexNumber comp1 = new ComplexNumber(1.1, 3.3);
        ComplexNumber comp2 = new ComplexNumber(5.5, 9.3);
        System.out.print(comp1.toString() + " + " + comp2.toString() + " = ");
        comp1.add(comp2);
        System.out.println(comp1.toString());
    }
}
