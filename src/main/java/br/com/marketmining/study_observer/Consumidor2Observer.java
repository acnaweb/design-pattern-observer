package br.com.marketmining.study_observer;

import java.util.Observable;
import java.util.Observer;

public class Consumidor2Observer implements Observer {
	private Observable fonteDeDados;

	public Consumidor2Observer(Observable fonteDeDados) {
		this.fonteDeDados = fonteDeDados;

		// aqui a fonte de dados toma conhecimento da classe atual para notificar
		// atualizacoes
		this.fonteDeDados.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof FonteDeDadosObservable) {
			FonteDeDadosObservable fonteDeDados = (FonteDeDadosObservable) observable;

			// pega a informacao atualizada
			String dados = fonteDeDados.getDados();

			System.out.println(String.format("Consumidor2Observer - Informacao da fonte de dados -> %s", dados));

			
			System.out.println(String.format("Consumidor2Observer - Informacao do argumento -> %s", arg));

		}
	}

}
