package mahumokregistrationform;

import java.util.Scanner;
import java.time.LocalDate;

public class MahumokRegistrationForm {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("REGISTRATION FORM");
        
        System.out.println("First name: ");
        String Fname = sc.nextLine();
        
        System.out.println("Last name: ");
        String Lname = sc.nextLine();
        
        System.out.println("Middle name: ");
        String Mname = sc.nextLine();
        
        System.out.println("Enter your student ID number: ");
        String IDnum = sc.nextLine();
       
        System.out.println("Enter the program you're enrolling in: ");
        String Program = sc.nextLine();
        
        System.out.println("Enter your intended major or concentration: ");
        String major = sc.nextLine();
        
        System.out.println("Enter your highschool GPA: ");
        String GPA = sc.nextLine();
        
        System.out.println("Guaridan or Emergency contact full name: ");
        String ioe = sc.nextLine();
        
        System.out.println("Emergency contact number: ");
        String ioenum = sc.nextLine();
        
        System.out.println("Your age: ");
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter your birth year: "); 
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your birth month: "); 
        int month = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your birth day: "); 
        int day = Integer.parseInt(sc.nextLine());

        
        LocalDate birthdate = LocalDate.of(year, month, day);
        
        
        System.out.println("Your address: ");
        String address = sc.nextLine();
        
      
        
         System.out.println("What is your gender M/F: ");
         String gender = sc.nextLine();
                
           
                
                
                
             
                System.out.println("---COLLEGE ENROLLMENT SUMMARY---");
                
                System.out.println("Student name: " +Fname +Mname +Lname);
                System.out.println("Age: " +age);
                System.out.println("Student ID: " +IDnum);
                System.out.println("Program: " +Program);
                System.out.println("Gender: "+gender);
                System.out.println("Intended Major/Concentration: " +major);
                System.out.println("High school GPA: " +GPA);
                System.out.println("Guardian/Emergency contact: " +ioe);
                System.out.println("Guardian's contact number: " +ioenum);
                System.out.println("Birthdate: " +birthdate);
                System.out.println("Address: " +address);
    }
    

    }
