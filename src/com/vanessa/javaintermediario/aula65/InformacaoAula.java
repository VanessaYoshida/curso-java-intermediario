package com.vanessa.javaintermediario.aula65;

@interface InformacaoAula {

	String autor();

	int aulaNumero();

	String blog() default "http://vanessa.com";

	String site() default "http://vanessa";
}
