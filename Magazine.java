// Name of the Student: Jay Patel
// Class: CS 3345
// Section: 004
// Semester: Spring 2019
// Project 2: Linked List

public class Magazine implements IDedObject{
  
   private int magazineID;
   String magazineName;
   String publisherName;
  
   
   public Magazine(int magazineID, String magazineName, String publisherName){
       this.magazineID = magazineID;
       this.magazineName = magazineName;
       this.publisherName = publisherName;
   }
  
   
   // Returns magazineID
   
   @Override
   public int getID() {
      
       return magazineID;
   }


  //Prints magazine details
   @Override
   public void printID() {

       System.out.println("Magazine ID: "+magazineID);
       System.out.println("Magazine Name: "+magazineName);
       System.out.println("Publisher Name: "+publisherName);
      
   }

}