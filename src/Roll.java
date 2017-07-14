import java.util.Random;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 * Created by Gateway on 7/13/2017.
 */
public class Roll {

    public static void main(String[] args) {

        int sides = 0;
        int die1;
        int die2;
        String answer;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Welcome to the GrandCircus Casino! \n");

            System.out.println("How many sides should each die have? ");

            sides = scan.nextInt();
            scan.nextLine();

            System.out.println(roll(sides));

            System.out.println(roll2(sides));



            System.out.println("Would you like to continue (yes or no)");

            answer = scan.nextLine();


        } while (answer.equalsIgnoreCase("Yes"));


    }


    public static int roll(int a) {

        Random rand = new Random();

        return 1 + rand.nextInt(a);

    }

    public static int roll2(int a) {


        return 1 + (int) (Math.random()*a);

    }

}



