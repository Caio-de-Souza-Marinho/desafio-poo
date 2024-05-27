package com.iphone.main;

import com.iphone.model.Iphone;

public class IphoneMain {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// REPRODUTOR MUSICAL
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("ABRIR REPRODUTOR MUSICAL");
		iphone.selecionarMusica("Lost - Frank Ocean");
		iphone.tocar();
		iphone.pausar();
		
//		APARELHO TELEFÔNICO
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("ABRIR APARELHO TELEFÔNICO");
		iphone.ligar("(11) 99999-9999");
		iphone.iniciarCorreioVoz();
		iphone.atender();
		
//		NAVEGADOR DE INTERNET
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("ABRIR NAVEGADOR DE INTERNET");
		iphone.exibirPagina("google.com");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}
}
