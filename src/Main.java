import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        try {
            // Get n from the user.
            System.out.print("Give an integer number which will serve as the divident!");
            int divident = console.nextInt();
            System.out.print("Give an integer number which will serve as the divider!");
            int divider = console.nextInt();
            if (divider == 0) {
                System.out.print("Division with zero as a divider cannot be performed!");
            } else {
                //double result = (double) divident / divider;
                System.out.print("Representation: "+divident+" = "+ divident / divider+"*"+divider+" + "+divident%divider);
            }
        }
        catch (Exception e){
            System.out.print("Next time try giving an integer number!");

        }
    }
}
