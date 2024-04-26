package ar.com.unpaz.controller;

public class Principal {

	public static void main(String[] args) {
		
		Proceso1 sProceso1 =  new Proceso1();
		sProceso1.start();
		
		Thread sProceso2 = new Thread(new Proceso2());
		sProceso2.start();
		
	

	}

}
