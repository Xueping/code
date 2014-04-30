package uts.codesale.service;

public class ServiceTest {
	
	private String message;

	   //Constructor
	   //@param message to be printed
	   public ServiceTest(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

}
