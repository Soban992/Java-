
package com.company ;
import java.util.Scanner;
import java.util.Random;






public class Looping {
    public static void main(String[] args) {
        System.out.println("Enter Number of your choice");
        Scanner sc = new Scanner(System.in);

        int usr_choice = sc.nextInt();

        System.out.println("User Entered Number IS " + usr_choice);
        Random rand = new Random();
        int comp_choice = rand.nextInt(10);
        System.out.println("Random Generated Number is " + comp_choice);
        if(usr_choice==comp_choice)
        {

            System.out.println("Congragulations ! You Gussed Right");

        }

        else
        {
            System.out.println(" Sorry Your Guess is Not Right");
        }











    }
}
