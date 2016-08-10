package gom.Samrat.Models;

public class Exthread extends Thread{
	  public void run(){
		  System.out.println("Thread name is: Thread A");
		  System.out.println("running thread priority  of Thread A:"+Thread.currentThread().getPriority());
	  }
	  public static void main(String[] args) {
		  Exthread tr= new Exthread();
		  Exthread1 hr= new Exthread1();
		  Exthread2 mr= new Exthread2();
		  tr.setPriority(Thread.MIN_PRIORITY);
		  hr.setPriority(Thread.NORM_PRIORITY);
		  mr.setPriority(Thread.MAX_PRIORITY);
		  tr.start();
		  hr.start();
		  mr.start(); 
		  
		  
		  
		  
		  
	  }

}
