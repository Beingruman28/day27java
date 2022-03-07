package day27java;


interface Sayable{  
    void say();  
}  

public class Referencemethod {
 

	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }

	public static void main(String[] args) {
		// Referring static method  
        Sayable sayable = Referencemethod::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
