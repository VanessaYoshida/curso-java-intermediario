package com.vanessa.javaintermediario.aula70;

import com.vanessa.javaintermediario.aula69.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thred1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thred2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thred3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);
		
		//Se não definir a prioridade das threads ele executa na ordem que dele
		//mas se definir a prioridade como abaixo, ele vai tentar seguir a prioridade
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		//t1.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}