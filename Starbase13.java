// Package for use with commercial applications. I am using jetbrains as there is no business need for this right now.
package com.jetbrains;

/* Import swing class called JOptionPane from javax. This allows me to bring up option pane for dialog as seen in
   my main method. */
import javax.swing.JOptionPane;

/* Begin Starbase13 class. This is creating my own personal class called Starbase13, allowing custom steps be made
   rather than relying on premade classes such as JOptionPane, LocalDate, Etc. */
public class Starbase13
{
    // Begin main, where all program steps are taken and run.
    public static void main(String[] args)
    {
        /* Brings up a dialog pane that outputs the string entered below and sets user input as variable "name" and
           stores it for later use. */
        String name = JOptionPane.showInputDialog("HAL: 'My name is Heuristacally Programmed Algorithmic Computer! You can " +
                "call me HAL for short. What is your name?'");

        // Basic println statement, but includes /n to drop down a line, as well as calling the entered name in the middle.
        System.out.println("\nHAL: 'Identity confirmed. Thank you " + name + ". You will be arriving at Starbase 13 " +
                "momentarily.'");

        // Begin storytelling, using println statements that outputs the strings I've designated below.
        System.out.println("\nThe over-friendly computer voice fades away with a quiet beep.");
        System.out.println("The window covers hum quietly as they all rise at once automatically.");
        System.out.println("The vast expanse and reflective light from Earth is what's seen first as the blinds open. " +
                "This makes you extremely nervous to say the least.");
        System.out.println("After a minute or so, you notice your destination coming into view.");
        System.out.println("Printed in large, stencil like numbers on the side of the structure is the number 13.");
        System.out.println("'This must be Starbase 13', you think to yourself.");
        System.out.println("The station is absolutely massive and covered in all sorts of devices I couldn't even " +
                "begin to explain.");
        System.out.println("Surprisingly enough, the color is very grey which was a boring choice.");
        System.out.println("The tender docks smoothly with Starbase 13 near a large group of solar panels which provide" +
                " power to the base.");
        System.out.println("Being in the back of the tender, you wait patiently for other passengers to depart.");
        System.out.println("Finally. Your turn. You exit the transpo ship and your story begins.");
    }
    // End main.
}
// End Starbase13 class.