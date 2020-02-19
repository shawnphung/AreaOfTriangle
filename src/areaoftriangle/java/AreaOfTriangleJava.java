/*
 * Shawn Phung
 * Feb 19, 2020
 * Area of Tringle (Trig or Heron)
 */

package areaoftriangle.java;
import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class AreaOfTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       // Declare Variable
        int choice; //Allows user to choose between trig or Heron's formula
        double a, b, c, s, area, semi, angleC; //Side measurements, semi-perimeter, and the area
        
        System.out.println("Enter your method");
        System.out.println("Enter 1 to use trig");
        System.out.println("Enter 2 to use Heron's formula");
        
        choice = input.nextInt();
        if (choice == 1){
            for (int i = 1; i < 10000; i++){
                //Prompts user with input values
                System.out.println("Enter your first side");
                a = input.nextDouble();
                System.out.println("Enter your second side");
                b = input.nextDouble();
                System.out.println("Enter your third angle");
                angleC = input.nextDouble();
                //Calculate the area
                area = ((a + b + Math.sin(angleC))/2);
                System.out.println("The area of your triangle is: " + area);
                }
            }
        else if (choice == 2){
                //Prompts user with input values
                System.out.println("Enter your first side");
                a = input.nextDouble();
                System.out.println("Enter your second side");
                b = input.nextDouble();
                System.out.println("Enter your third side");
                c = input.nextDouble();
                //Calculate the area
                semi = (a+b+c)/2;
                area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
                System.out.println ("The area of your triangle is: " + area);
                }
        else {
            System.out.println ("Please enter a valid option");     //Basically ends program if user enters something invalid
        }
            }
        
        
        
    }
    

