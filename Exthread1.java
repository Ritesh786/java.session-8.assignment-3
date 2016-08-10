package gom.Samrat.Models;

public class Exthread1 extends Thread{
	 public void run(){
		  System.out.println(" Thread name is: Thread B ");
		  System.out.println("running thread priority of Thread B:"+Thread.currentThread().getPriority());
	  }

}
