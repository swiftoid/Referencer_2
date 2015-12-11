import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Andy on 11/12/2015.
 */


    import java.util.Scanner;
    import java.io.FileWriter;
    import java.io.PrintWriter;
    import java.io.IOException;


import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


/**
 * Created by Andy on 15/10/2015.
 */

public class action {


    public static void main(String args[]) {


        System.out.println("Please enter the authors Surname");

        Scanner author = new Scanner(System.in);

        String part_one = author.next();


        System.out.println("Enter the Initials of The Author Please");

        Scanner initials = new Scanner(System.in);

        String part_two = initials.next();


        // ###    ... means dont know how many of something  ####


        System.out.println("Enter the year of the publication please");

        Scanner year = new Scanner(System.in);

        String part_three = year.next();


        // Font setting here for italics on system.out. ???? !!!

        System.out.println("Please enter the title of the publication");

        Scanner title = new Scanner(System.in);

        String part_four = title.next();


        System.out.println("Where was the the Book Published ?");

        Scanner published_in = new Scanner(System.in);

        String part_five = published_in.next();


        System.out.println("Please enter the Publisher");

        Scanner publisher = new Scanner(System.in);

        String part_six = publisher.next();


        // FINAL ASSEMBLY OF BOOK REFERENCE //

        System.out.println("Your Reference = " + part_one + "," + part_two + "("
                + part_three + ")," + part_four + "," + part_five + "," + part_six + ".");


    }
}



