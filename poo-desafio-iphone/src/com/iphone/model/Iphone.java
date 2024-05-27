package com.iphone.model;

import com.iphone.model.apps.AparelhoTelefonico;
import com.iphone.model.apps.NavegadorInternet;
import com.iphone.model.apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	// REPRODUTOR MUSICAL
	public void tocar() {
		System.out.println("Play na música");
	}

	public void pausar() {
		System.out.println("Pause na música");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Música: " + musica + " selecionada");
	}

	// APARELHO TELEFÔNICO
	public void ligar(String numero) {
		System.out.println("Ligar para o número " + numero);
	}

	public void atender() {
		System.out.println("Atender telefone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Gravar correio de voz");
	}

	// NAVEGADOR DE INTERNET
	public void exibirPagina(String url) {
		System.out.println("Exibir página do url " + url);
	}

	public void adicionarNovaAba() {
		System.out.println("Abrir nova aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizar página");
	}
}