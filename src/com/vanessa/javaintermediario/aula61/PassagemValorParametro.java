package com.vanessa.javaintermediario.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;

		System.out.println("***** Valores originais");

		System.out.println(contato); //Devolve o contato 1
		System.out.println(valor); //Devolve o valor 10

		System.out.println("***** Exemplo 1");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato); //Devolve o contato 1
		System.out.println(valor); //Devolve o valor 10

		System.out.println("***** Exemplo 2");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato); //Devolve o nome do contato como Contato20 (porque modificamos os valores da referência Heap por ser um objeto)
		System.out.println(valor); //Devolve o valor 10
	}


	private static void testePassagemValorReferencia(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato"+novoValor);
	}

}
