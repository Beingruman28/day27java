package day27java;

public class InstanceMethod {
	 public void printnMsg(){  
	        System.out.println("Hello, this is instance method");  
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Thread t2=new Thread(new InstanceMethod()::printnMsg);  
	        t2.start();       
	    }  
	}  
   