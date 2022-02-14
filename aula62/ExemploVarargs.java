package com.vanessa.javaintermediario.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(soma(vetor));

		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //varargs
	}

	static int soma(int a, int b){ //desta forma o método fica fixo que só pode receber 2 parâmetros
		return a + b;
	}

	static int soma(int a, int b, int c){ //desta forma o método fica fixo que só pode receber 3 parâmetros
		return a + b + c;
	}

	static int soma(int[] vetor){ ////desta forma consegue passar vários valores mas dentro do vetor apenas

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}

	static int soma(int a, int b, Integer... vetor){ //quando coloca os três pontinhos é o varargs. Ele permite você poder usar o método com quandos parâmetros precisar
		//obs.: o varargs precisa ser declarado por último, se tiver inteiros como acima precisa vir antes, porque senão não tem como saber onde o varargs termina
		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}

}
