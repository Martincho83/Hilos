package ar.com.unpaz.controller;

public class Proceso1  extends Thread{

	@Override
	public void run() {
		for(int i = 0;i< 10; i++) {
			 System.out.println("Proceso 1 " +  i);
		}
	}

}
