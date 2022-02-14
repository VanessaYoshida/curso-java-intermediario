package com.vanessa.javaintermediario.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Olá, Mundo!"); //%s é string
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!"); //%S está pedindo para o java mudar tudo para caixa alta
		System.out.println();

		System.out.printf("%c", 'c'); //caracter
		System.out.println();
		System.out.printf("%C", 'c'); //caracter caixa alta

		System.out.printf("%n"); //pular linha

		int valor = 123456789;
		System.out.printf("%d", valor); //números inteiros

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); //ponto flutuante (mas está arredondando o valor)

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); //colocar espaço de tantos caracteres antes (no caso vai ter 20 espaços)

		System.out.println();

		System.out.printf("%-20s", olaMundo);//colocar espaço de tantos caracteres depois (no caso vai ter 20 espaços)

		System.out.println();

		System.out.printf("%+d", valor); //vai imprimir + na frente

		System.out.println();

		System.out.printf("%015d", valor); //acrescenta zeros até completar o tamanho de 15

		System.out.println();

		System.out.printf("%,d", valor); // (separa os números com virgula) Brasil é virgula e EUA é ponto

		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2); //se colocar um espaço ele vai aparecer o sinal caso o número seja negativo
		System.out.println();
		System.out.printf("% d", valor); // se numero for positivo não aparece o sinal de +

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante); //3 casas decimais depois da virgula

		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante);//tem 10 números, e com precisão depois da virgula de 2 numeros

		System.out.println();

		testeMaisCompleto();
	}

	private static void testeMaisCompleto(){

		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]); //%s %02d => string, depois inteiro que comece com 0 e mantenha com duas casas
													//flutuante separado com virgula, 10 espaços de número e precisão de 2 e depois pular de linha
		}

		//Java.util.Formater

	}

}
