package gom.Samrat.Models;

public class Exthread2 extends Thread{
	 public void run(){
		  System.out.println(" Thread name is: Thread C ");
		  System.out.println("running thread priority of Thread C:"+Thread.currentThread().getPriority());
	  }

}
