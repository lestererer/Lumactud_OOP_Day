/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lumactudactivity1;

import java.util.Scanner;


public class LumactudActivity1 {

    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter your gender: ");
        String gender = input.nextLine();
        
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        
        System.out.print("Enter your civil status: ");
        String status = input.nextLine();
        
        System.out.print("How many brothers and/or sisters do you have: ");
        int siblings = input.nextInt();
        
        
        System.out.println("\n\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Civil Status: " + status);
        System.out.println("Number of Brothers and/or Sisters: " + siblings);
     }
    
}
