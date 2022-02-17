package com.vanessa.javaintermediario.aula67;

public class Teste {
	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start(); // O start está dentro do MinhaThread
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
		MinhaThread thread4 = new MinhaThread("Thread #4", 700);
		
		MinhaThread thread5 = new MinhaThread("Thread #5", 1000);
		
		MinhaThread thread6 = new MinhaThread("Thread #6", 400);
	}

}
