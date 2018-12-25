/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author chinonsoobidike
 *This is a program calculates the factorial of a user-defined integer
*/
public class Factorial
{
    /**
     * @param args the command line arguments
     */
   public static void main (String [] args)
   
   {
   //declare variables
      int number,x, fac;
      Scanner input = new Scanner(System.in);
    
    //get a number from the user, ensure it is more than zero
       do{
      System.out.println("Enter an integer greater than zero and less than 32");
      number = input.nextInt();
       } while(number < 0 || number > 31);
      
      
      x = number;//assign the user input to the variable x
       fac = number;
       number --;
    //find the factorial of the entered number
      while(number >= 1)
      {
         
          fac *= number;
         number--;
      } 
      System.out.println("The factorial of the integer " + x+" is\n" + fac);
   }
}   

