package com.vanessa.javaintermediario.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){ //Quando declara um parâmetro desta forma é criada uma variável local no Java com o mesmo nome dentro do método

		valor = valor + 10; //nesse momento não está alterando o valor do atributo lá em cima ("private int valor;")

		//this.valor = valor;//só iria alterar o valor do atributo se declarasse o ("this.valor = valor;")

		return valor;
	}

	public int teste(){

		int valor = 5;//criou uma variável local que tem escopo somente dentro do método

		if (true){

			valor--;
		}

		//this.valor = valor; //referencial valor global/atributo da classe //só iria alterar o valor do atributo se declarasse o ("this.valor = valor;")

		return valor;
	}

	public void outroTeste(){

		for (int i=0; i<10; i++){
			System.out.println(i);
		}

		//i++; //erro de compilação porque a variável i está criada apenas dentro do escopo do for

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10 // aqui funciona porque o j foi declarado fora do for
	}

	public void maiUmTeste(){

		boolean flag = true;

		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compilação porque a variavel foi criada dentro do if
	}

	public void maiUmOutroTeste(int num){

		int total = 0;

		try {
			int outroNum = 0;

			total = num/outroNum;

		} catch (Exception e){
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compilação
			//e.printStackTrace(); //erro de compilação
		}

		num++;

		//outroNum++; //erro de compilação
		//e.printStackTrace(); //erro de compilação

	}
}