package com.vanessa.javaintermediario.aula56.labs;

public class Calculadora {

	enum Operacao{
		SOMAR("+") {
			@Override
			public double executarOperacao(double x, double y) {
				return x + y;
			}
		}, SUBTRAIR("-") {
			@Override
			public double executarOperacao(double x, double y) {
				return x - y;
			}
		}, MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double x, double y) {
				return x * y;
			}
		}, DIVIDIR("/") {
			@Override
			public double executarOperacao(double x, double y) {
				return x / y;
			}
		};
	
		private String simbolo;
		
		//construtor
		Operacao(String simbolo){
			this.simbolo = simbolo;
		}
		
		//método abstrato
		public abstract double executarOperacao(double x, double y);
				
		public String toString() {
			return this.simbolo;
		}
	}
	
	public static void main(String[] args) {
		
		double x = 4.0;
		double y = 2.0;
		
		for (Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}

}
