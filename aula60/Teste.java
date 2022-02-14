package com.vanessa.javaintermediario.aula60;

public class Teste {

	public static void main(String[] args) {

		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor()); //10

		System.out.println(escopo.calculaValor(20)); //20 ou 30? Volta o valor: 30

		System.out.println(escopo.getValor()); //10 ou 20? Volta o valor: 10

		System.out.println(escopo.teste()); //4 ou 9? Volta o valor: 4

		System.out.println(escopo.getValor()); //aqui vemos que o valor do atributo não foi alterado, retorna o valor 10

	}

}
