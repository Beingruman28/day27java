package day27java;

public class InterfaceReferStatic {  //Interface

	public static void ThreadStatus(){      //static
        System.out.println("Thread is running...");  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Thread t2=new Thread(InterfaceReferStatic::ThreadStatus);  //interface refer to static
	        t2.start();       
	    }  
}