package day27java;


interface Sayable1{  
    void say();  
} 

public class NonStaticMethod {
	    public void saySomething(){  
	        System.out.println("Hello, this is non-static method.");  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethod nsm = new NonStaticMethod(); // Creating object  
	        // Referring non-static method using reference  
		Sayable1 sayable1 = nsm::saySomething;  
	        // Calling interface method  
	            sayable1.say();  
	            // Referring non-static method using anonymous object  
	
	            Sayable sayable2 = new NonStaticMethod()::saySomething; // You can use anonymous object also  
	            // Calling interface method  
	            sayable2.say();  
	    }  
	}  
	