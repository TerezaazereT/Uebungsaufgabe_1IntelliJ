//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean test = false;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bist du 18 Jahre alt? ");
            String eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("Ja")||eingabe.equalsIgnoreCase("Yes")) {
                System.out.println("Okdoky");
                test = true;
            } else {
                System.out.println("No Entry");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }while (!test);

    }
}






        /*System.out.print("Bist du 18 Jahre alt?");

        String Input;
        Scanner eingabewert = new Scanner(System.in);
        Input = eingabewert.nextLine();

        if (eingabewert.equalsIgnoreCase("Ja"));
        System.out.println("OK");



        }



                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }*/
