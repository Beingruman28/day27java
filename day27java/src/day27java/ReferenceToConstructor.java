package day27java;

interface Messageable{  
    Message getMessage(String msg);  
} 

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }
}
public class ReferenceToConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Messageable hello = Message::new;      //ClassName::new   Syntax to refer a constructor with new keyword
	        hello.getMessage("Hello Constructor");  
	    }  
	}
  