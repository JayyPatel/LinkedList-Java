// Name of the Student: Jay Patel
// Class: CS 3345
// Section: 004
// Semester: Spring 2019
// Project 2: Linked List

import java.util.Scanner;
public class Main {
  
   public static void main(String args[]){
      
       LinkedList<Magazine> magazineList = new LinkedList<Magazine>();
      
       String str = "Operations on List\n"+
               "1. Make Empty\n"+
               "2. Find ID\n"+
               "3. Insert At Front\n"+
               "4. Delete From Front\n"+
               "5. Delete ID\n"+
               "6. Print All Records\n"+
               "7. Done\n"+
               "Your Choice: ";
       System.out.print(str);
      
       Scanner sc = new Scanner(System.in);
      
       int choice;
       choice=sc.nextInt();
      
       //Iterate while user is not done
       while(choice!=7){
          
           int magazineID;
           String magazineName, publisherName;
           IDedObject object;
           Magazine magazine;
           // Switch case for choices
           switch(choice){
           case 1:
               //Empty the list
               magazineList.makeEmpty();
               break;
              
           case 2:
               //Find magazine ID in the list
               System.out.print("Enter Magazine ID: ");
               magazineID = sc.nextInt();
               Magazine m = magazineList.findID(magazineID);
               if(m!=null){
                   //Print found magazine details
                   m.printID();
               }
               else{
                   //Print magazine not found
                   System.out.println("No magazine found");
               }
               break;
              
           case 3:
               //Enter magazine into the list
               System.out.print("Enter Magazine ID: ");
               magazineID = sc.nextInt();
               System.out.print("Enter Magazine Name: ");
               magazineName = sc.next();
               System.out.print("Enter publisher Name: ");
               publisherName = sc.next();
              
               magazine = new Magazine(magazineID, magazineName, publisherName);
               //Insert magazine
               if(magazineList.insertAtFront(magazine)){
                   System.out.println("Magazine Added");
               }
               else{
                   //If magazine already present
                   System.out.println("Magazine Already Present");
               }
               break;
              
           case 4:
               //Delete record from front of the list
               object = magazineList.deleteFromFront();
               if(object!=null){
                   System.out.println("Magazine Deleted");
                   object.printID();
               }
               else{
                   System.out.println("List is empty");
               }
               break;
              
           case 5:
               //Delete record with ID
               System.out.print("Enter Magazine ID to delete: ");
               magazineID = sc.nextInt();
               object = magazineList.delete(magazineID);
               if(object!=null){
                   System.out.println("Magazine Deleted");
                   object.printID();
               }
               else{
                   //No such record found
                   System.out.println("Magazine Not Found");
               }
               break;
              
           case 6:
               //Print all records
               magazineList.printAllRecords();
               break;
           default:
               System.out.println("Invalid Choice");
               break;
               
        	   
           
           }
           
          
           //Input choice again
           System.out.println(str);
           choice = sc.nextInt();
       }
       System.out.println("Done...!");
   }

}
